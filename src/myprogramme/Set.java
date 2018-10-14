package myprogramme;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Set {

    private ArrayList<Sweets> setOfSweets = new ArrayList<>();
    public HashSet<Sweets> uniqueSweets = new HashSet<>(setOfSweets);

    private Chokolate chokolate = new Chokolate("Chokolate", 2, 100.45);
    private Jellybean jellybean = new Jellybean();
    private Candy candy = new Candy("Candy", 1, 4.58);
    private MainMenu mainMenu = new MainMenu();

    private void addCountOfPosition(int countOfPosition, Sweets sweets) throws ExeptionForThisProject {
        try {
            for (int i = 0; i < countOfPosition; i++) {
                setOfSweets.add(sweets);
            }
            System.out.println(MainMenu.LINE + countOfPosition + " шт " + sweets.getName() + " "
                    + MainMenu.POSITION_ADDED_SUCCESSFULLY);
        } catch (Exception e) {
            System.out.println(" ");
        }
    }

    private void deleteCountOfPosition(int countOfPosition, Sweets sweets) {
        try {
            if (countOfPosition > (setOfSweets.lastIndexOf(sweets) + 1) && setOfSweets.size() != 0) {
                System.out.println("Мы не можем удалить больше чем " + (setOfSweets.lastIndexOf(sweets) + 1) + " шт" + " " + sweets.getName());
            }
            if (countOfPosition <= (setOfSweets.lastIndexOf(sweets)) + 1) {
                for (int i = 0; i < countOfPosition; i++) {
                    setOfSweets.remove(sweets);
                }
                System.out.println(MainMenu.LINE + countOfPosition + " шт " + sweets.getName() + " "
                        + MainMenu.POSITION_REMOVED_SUCCESS);

            }
        } catch (Exception e) {
            System.out.println(" ");
        }
    }

    private String getSpaceInputBetweenWords(String s) {
        String SPACE = "                                                              ";
        return new String(new char[SPACE.length() - s.length()]).replace("", " ");
    }

    void doInteractionWithPositions(int menu, int id, int count) throws ExeptionForThisProject {
        try {
            if (menu == 1) {
                switch (id) {
                    case 1:
                        addCountOfPosition(count, chokolate);
                        break;
                    case 2:
                        addCountOfPosition(count, candy);
                        break;
                    case 3:
                        addCountOfPosition(count, jellybean);
                        break;
                    default:
                        mainMenu.showPositionSorryMessage();
                        break;
                }
            } else if (menu == 2) {
                switch (id) {
                    case 1:
                        if (setOfSweets.contains(chokolate)) {
                            deleteCountOfPosition(count, chokolate);
                            break;
                        }
                    case 2:
                        if (setOfSweets.contains(candy)) {
                            deleteCountOfPosition(count, candy);
                            break;
                        }
                    case 3:
                        if (setOfSweets.contains(jellybean)) {
                            deleteCountOfPosition(count, jellybean);
                            break;
                        }
                    default:
                        mainMenu.showPositionSorryMessage();
                }
            } else {
                mainMenu.showMenuSorryMessage();
            }
        } catch (ExeptionForThisProject exeptionForThisProject) {
            System.out.println("Что то  пошло не так, проблемы уже устраняются...");
        }
    }

    void setTotal(int menu) {
        List<StringBuilder> totals = new ArrayList<>();
        try {
            if (menu == 3) {
                double x = 0;
                double y = 0;
                System.out.println(
                        MainMenu.TOTAL_OF_POSITION + "\n");
                for (int i = 0; i < setOfSweets.size(); i = i + 3) {
                    String name1 = "Название: " + setOfSweets.get(i).getName();
                    String name2 = "Название: " + setOfSweets.get(i + 1).getName();
                    String name3 = "Название: " + setOfSweets.get(i + 2).getName();
                    String weight1 = "Вес: " + setOfSweets.get(i).getWeight();
                    String weight2 = "Вес: " + setOfSweets.get(i + 1).getWeight();
                    String weight3 = "Вес: " + setOfSweets.get(i + 2).getWeight();
                    String price1 = "Цена: " + setOfSweets.get(i).getPrice();
                    String price2 = "Цена: " + setOfSweets.get(i + 1).getPrice();
                    String price3 = "Цена: " + setOfSweets.get(i + 2).getPrice();
                    String unique1;
                    if (setOfSweets.get(i).equals(candy)) {
                        unique1 = "Фирма производителя: " + candy.getClass().getMethod("returnSpecialValues").getAnnotation(SweetAnnotation.class).unique();
                    } else if (setOfSweets.get(i).equals(chokolate)) {
                        unique1 = "Тип шоколада: " + chokolate.getClass().getMethod("returnSpecialValues").getAnnotation(SweetAnnotation.class).unique();
                    } else {
                        unique1 = setOfSweets.get(i).returnSpecialValues();
                    }
                    String unique2 = setOfSweets.get(i + 1).returnSpecialValues();
                    String unique3 = setOfSweets.get(i + 2).returnSpecialValues();
                    totals.add(new StringBuilder(name1 + getSpaceInputBetweenWords(name1) + name2 + getSpaceInputBetweenWords(name2) + name3));
                    totals.add(new StringBuilder(weight1 + getSpaceInputBetweenWords(weight1) + weight2 + getSpaceInputBetweenWords(weight2) + weight3));
                    totals.add(new StringBuilder(price1 + getSpaceInputBetweenWords(price1) + price2 + getSpaceInputBetweenWords(price2) + price3));
                    totals.add(new StringBuilder(unique1 + getSpaceInputBetweenWords(unique1) + unique2 + getSpaceInputBetweenWords(unique2) + unique3));
                    totals.add(new StringBuilder(MainMenu.LINE));

/*                    System.out.println(new StringBuilder(name1 + getSpaceInputBetweenWords(name1) + name2 + getSpaceInputBetweenWords(name2) + name3));
                    System.out.println(new StringBuilder(weight1 + getSpaceInputBetweenWords(weight1) + weight2 + getSpaceInputBetweenWords(weight2) + weight3);
                    System.out.println(new StringBuilder(price1 + getSpaceInputBetweenWords(price1) + price2 + getSpaceInputBetweenWords(price2) + price3));
                    System.out.println(new StringBuilder(unique1 + getSpaceInputBetweenWords(unique1) + unique2 + getSpaceInputBetweenWords(unique2) + unique3));
                    System.out.println(MainMenu.LINE);*/
                }

                //Использование потока для вывода в консоль
                totals.stream().forEach(System.out::println);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    boolean isGameover(int menu) {
        try {
            if (menu == 4) {
                System.out.println(MainMenu.BYE_BYE_MESSAGE);
                return true;
            } else {
                System.out.println(MainMenu.STARS_LINE +
                        MainMenu.MAIN_MENU_SORRY_MESSAGE +
                        MainMenu.STARS_LINE);
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }
}
