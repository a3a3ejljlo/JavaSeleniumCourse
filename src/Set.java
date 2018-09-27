import java.util.ArrayList;
import java.util.HashSet;

public class Set {
    private ArrayList<Sweets> setOfSweets = new ArrayList<>();
    public HashSet<Sweets> uniqueSweets = new HashSet<>(setOfSweets);

    private Chokolate chokolate = new Chokolate();
    private Jellybean jellybean = new Jellybean();
    private Candy candy = new Candy();
    private MainMenu mainMenu = new MainMenu();

    public void addCountOfPosition(int countOfPosition, Sweets sweets) {
        for (int i = 0; i < countOfPosition; i++) {
            setOfSweets.add(sweets);
        }
        System.out.println(MainMenu.LINE + countOfPosition + " шт " + sweets.getName() + " "
                + MainMenu.POSITION_ADDED_SUCCESSFULLY);
    }

    public void deleteCountOfPosition(int countOfPosition, Sweets sweets) {
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
    }

    boolean doInteractionWithPositions(int menu, int id, int count) {
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
                    System.out.println(MainMenu.POSITION_SORRY_MESSAGE);
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
            System.out.println(MainMenu.MAIN_MENU_SORRY_MESSAGE);
        }
        return false;
    }

    boolean setTotal(int menu) {
        if (menu == 3) {
            double x = 0;
            double y = 0;
            System.out.println(
                    MainMenu.TOTAL_OF_POSITION);
            for (int i = 0; i < setOfSweets.size(); i++) {
                x += setOfSweets.get(i).getPrice();
                y += setOfSweets.get(i).getWeight();
                System.out.println("\nНазвание: " + setOfSweets.get(i).getName() + "\nВес: " +
                        setOfSweets.get(i).getWeight() + "\nЦена: " +
                        setOfSweets.get(i).getPrice() + setOfSweets.get(i).returnSpecialValues());
            }
            System.out.println(
                    "\nНабор весит " + String.format("%.2f", y) + " грамм");
            System.out.println("В сумме получилось: " + String.format("%.2f", x) + " рублей");
            return false;

        } else if (menu == 4) {
            System.out.println(MainMenu.BYE_BYE_MESSAGE);
            return true;
        } else {
            System.out.println(MainMenu.STARS_LINE +
                    MainMenu.MAIN_MENU_SORRY_MESSAGE +
                    MainMenu.STARS_LINE);
            return true;
        }
    }

}
