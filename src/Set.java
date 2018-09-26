import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Set {
    private ArrayList<Sweets> setOfSweets = new ArrayList<>();

    Chokolate chokolate = new Chokolate();
    Jellybean jellybean = new Jellybean();
    Candy candy = new Candy();
    private MainMenu mainMenu = new MainMenu();

    boolean setActivitu(int menu, int id) {
        boolean isGameover = false;
        if (menu == 1) {
            switch (id) {
                case 1:
                    setOfSweets.add(chokolate);
                    System.out.println("\n\tChokolate успешно добавлен\n");
                    break;
                case 2:
                    setOfSweets.add(candy);
                    System.out.println("\n\tCandy успешно добавлен\n");
                    break;
                case 3:
                    setOfSweets.add(jellybean);
                    System.out.println("\n\tJellybean успешно добавлен\n");
                    break;
            }
        } else if (menu == 2) {
            switch (id) {
                case 1:
                    if (setOfSweets.contains(chokolate)) {
                        setOfSweets.remove(chokolate);
                        System.out.println("\n\tChokolate успешно удален\n");
                        break;
                    }
                case 2:
                    if (setOfSweets.contains(candy)) {
                        setOfSweets.remove(candy);
                        System.out.println("\n\tCandy успешно удален\n");
                        break;
                    }
                case 3:
                    if (setOfSweets.contains(jellybean)) {
                        setOfSweets.remove(jellybean);
                        System.out.println("\n\tJellybean успешно удален\n");
                        break;
                    } else {
                        System.out.println("\n********************************" +
                                "\nТаких позиций нет в наборе" +
                                "\n********************************");
                    }
            }
        } else {
            System.out.println("\n??????????????????????????????????" +
                    "\nУкажите существующий пункт меню!!!!!" +
                    "\n??????????????????????????????????");
        }
        return isGameover;
    }

    boolean setTotal(int menu) {
        boolean isGameover = false;
        if (menu == 3) {
            double x = 0;
            double y = 0;
            System.out.println(
                    "\n\tИтоговая информация по составу набора: ");
            for (int i = 0; i < setOfSweets.size(); i++) {
                x += setOfSweets.get(i).getPrice();
                y += setOfSweets.get(i).getWeight();
                System.out.println("\nНазвание: " + setOfSweets.get(i).getName() + "\nВес: " +
                        setOfSweets.get(i).getWeight() + "\nЦена: " +
                        setOfSweets.get(i).getPrice() + "\n");
            }
            System.out.println("\n**********************************************" +
                    "\nНабор весит " + y + " грамм");
            System.out.println("\nВ сумме получилось: " + x + " рублей");


        } else if (menu == 4) {
            System.out.println("\n**********************************************" +
                    "\n**********************************************" +
                    "\n\tСчастливого рождества и Нового года...\n" +
                    "\n**********************************************" +
                    "\n**********************************************");
            isGameover = true;
        } else {
            System.out.println("\n**********************************************" +
                    "\nВыберите существующий пункт меню" +
                    "\n**********************************************");
        }
        return isGameover;
    }

}
