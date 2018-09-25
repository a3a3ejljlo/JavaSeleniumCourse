import java.util.Scanner;

public class MainMenu {
    void startGreeting() {
        System.out.println("_____________________________________________________" +
                "\n\tМеню генератора Новогоднего подарка!\n" +
                "\tВведите номер пункта меню и нажмите Enter:\n" +
                "_____________________________________________________\n"+
                "1. Добавить позицию в Новогодний подарок\n" +
                "2. Удалить позицию из Новогоднего подарка\n" +
                "3. Вывести итоговую информацию о Новогоднем подарке\n" +
                "4. Выйти из программы");
    }

    void showLotOfPosition() {
        System.out.println("_____________________________________________________" +
                "\nВведите номер нужной вам позиции и нажмите Enter:\n" +
                "_____________________________________________________\n" +
                "1. Chokolate\n" +
                "2. Candy\n" +
                "3. JellyBean\n");
    }

    public int numberPointOfMenu() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return Integer.parseInt(s);
    }

    public int returnIdOfPosition() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return Integer.parseInt(s);
    }
}
