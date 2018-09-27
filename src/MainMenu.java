import java.util.Scanner;

public class MainMenu {
    public static final String MAIN_MENU_ADD = "\n1. Добавить позицию в Новогодний подарок";
    public static final String MAIN_MENU_DELETE = "\n2. Удалить позицию из Новогоднего подарка";
    public static final String MAIN_MENU_TOTAL = "\n3. Вывести итоговую информацию о Новогоднем подарке";
    public static final String MAIN_MENU_EXIT = "\n4. Выйти из программы";
    public static final String MAIN_MENU_TITLE = "\tМеню генератора Новогоднего подарка!\n";
    public static final String MAIN_MENU_NEED_ACTION = "\tВведите номер пункта меню и нажмите Enter: ";
    public static final String LINE = "\n_____________________________________________________\n";
    public static final String POSITION_MENU_NEED_ACTION = "\tВведите номер нужной вам позиции и нажмите Enter: ";
    public static final String POSITION_MENU_1 = "\n1. Chokolate";
    public static final String POSITION_MENU_2 = "\n2. Candy";
    public static final String POSITION_MENU_3 = "\n3. JellyBean";
    public static final String POSITION_ADDED_SUCCESSFULLY = "добавилось в Ваш Новогодний набор! \nПродолжайте набирать сладости пока не лопнет пакет!";
    public static final String POSITION_SORRY_MESSAGE = "\n\tТаких позиций нет в меню выбора позиций";
    public static final String POSITION_REMOVED_SUCCESS = "\n\tпозиция успешно удалена";
    public static final String MAIN_MENU_SORRY_MESSAGE = "\n??????????????????????????????????" +
            "\nУкажите существующий пункт меню!!!!!" +
            "\n??????????????????????????????????";
    public static final String TOTAL_OF_POSITION = "\n\tИтоговая информация по составу набора: ";
    public static final String STARS_LINE = "\n**********************************************\n";
    public static final String BYE_BYE_MESSAGE = "\n**********************************************" +
            "\n**********************************************" +
            "\n\tСчастливого Рождества и Нового года...\n" +
            "\n**********************************************" +
            "\n**********************************************";
    public static String COUNT_POSITION = "\tВведите количество, которое Вам необходимо";

    void startGreeting() {
        System.out.println(LINE +
                MAIN_MENU_TITLE +
                MAIN_MENU_NEED_ACTION +
                LINE +
                MAIN_MENU_ADD +
                MAIN_MENU_DELETE +
                MAIN_MENU_TOTAL +
                MAIN_MENU_EXIT+LINE);
    }

    void showLotOfPosition() {
        System.out.println(LINE +
                POSITION_MENU_NEED_ACTION +
                LINE +
                POSITION_MENU_1 +
                POSITION_MENU_2 +
                POSITION_MENU_3+LINE);
    }

    void showSorryMessage(){
        System.out.println(STARS_LINE+MAIN_MENU_SORRY_MESSAGE+STARS_LINE);
    }

    void showMenuInputCountOfPosition(){
        System.out.println(LINE+COUNT_POSITION+LINE);
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

    public int returnCountOfPosition() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        return Integer.parseInt(s);
    }
}
