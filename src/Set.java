import java.util.ArrayList;

public class Set {
    private ArrayList<Sweets> setOfSweets = new ArrayList<>();

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
            }
        } else if (menu == 2) {
            switch (id) {
                case 1:
                    if (setOfSweets.contains(chokolate)) {
                        setOfSweets.remove(chokolate);
                        System.out.println(MainMenu.POSITION_REMOVED_SUCCESS);
                        break;
                    }
                case 2:
                    if (setOfSweets.contains(candy)) {
                        setOfSweets.remove(candy);
                        System.out.println(MainMenu.POSITION_REMOVED_SUCCESS);
                        break;
                    }
                case 3:
                    if (setOfSweets.contains(jellybean)) {
                        setOfSweets.remove(jellybean);
                        System.out.println(MainMenu.POSITION_REMOVED_SUCCESS);
                        break;
                    }
                default:
                    System.out.println(MainMenu.POSITION_SORRY_MESSAGE);
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
