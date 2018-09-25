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
                        setOfSweets.remove(setOfSweets.remove(chokolate));
                        System.out.println("\n\tChokolate успешно удален\n");
                        break;
                    }
                case 2:
                    if (setOfSweets.contains(candy)) {
                        setOfSweets.remove(candy);
                        System.out.println("\n\tCandy успешно добавлен\n");
                        break;
                    }
                case 3:
                    if (setOfSweets.contains(jellybean)) {
                        setOfSweets.remove(jellybean);
                        System.out.println("\n\tJellybean успешно добавлен\n");
                        break;
                    } else {
                        System.out.println("Таких позиций нет в наборе");
                    }
            }
        }
        return isGameover;
    }

    boolean setTotal(int menu) {
        boolean isGameover = false;
        if (menu == 3) {
            double x = 0;
            double y = 0;
            for (int i = 0; i < setOfSweets.size(); i++) {
                x += setOfSweets.get(i).getPrice();
                y += setOfSweets.get(i).getWeight();
            }
            System.out.println("Набор весит " + y+" грамм");
            System.out.println("В сумме получилось: " + x+" рублей");

            System.out.println("\n\tИтоговая информация по составу набора = " + setOfSweets + "\n");
        } else if (menu == 4) {
            System.out.println("\n\tСчастливого рождества и Нового года.......\n");
            isGameover = true;
        } else {
            System.out.println("Выберите существующий пункт меню");
        }
        return isGameover;
    }

}
