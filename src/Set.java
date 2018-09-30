import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.HashSet;

public class Set {
    private ArrayList<Sweets> setOfSweets = new ArrayList<>();
    public HashSet<Sweets> uniqueSweets = new HashSet<>(setOfSweets);

    private Chokolate chokolate = new Chokolate("Chokolate",2,100.45);
    private Jellybean jellybean = new Jellybean();
    public Candy candy = new Candy("Candy",1,4.58);
    private MainMenu mainMenu = new MainMenu();

    public void addCountOfPosition(int countOfPosition, Sweets sweets) throws ExeptionForThisProject {
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

    public void deleteCountOfPosition(int countOfPosition, Sweets sweets) {
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

    public void doInteractionWithPositions(int menu, int id, int count) throws ExeptionForThisProject {
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
        try {
            if (menu == 3) {
                StringBuilder stringBuilder;
                double x = 0;
                double y = 0;
                System.out.println(
                        MainMenu.TOTAL_OF_POSITION);
                for (int i = 0; i < setOfSweets.size(); i++) {
                    x += setOfSweets.get(i).getPrice();
                    y += setOfSweets.get(i).getWeight();
                    String aboutPositionAllInfo = "\nНазвание: " + setOfSweets.get(i).getName() + "\nВес: " +
                            setOfSweets.get(i).getWeight() + "\nЦена: " +
                            setOfSweets.get(i).getPrice() + setOfSweets.get(i).returnSpecialValues();
                    stringBuilder = new StringBuilder(aboutPositionAllInfo);
                    System.out.println(stringBuilder.toString());
                }
                String aboutPositionWeight = "\nНабор весит " + String.format("%.2f", y) + " грамм";
                String aboutPositionPrice = "В сумме получилось: " + String.format("%.2f", x) + " рублей";
                stringBuilder = new StringBuilder(aboutPositionWeight + "\n" + aboutPositionPrice);
                System.out.println(
                        stringBuilder.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isGameover(int menu) {
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
