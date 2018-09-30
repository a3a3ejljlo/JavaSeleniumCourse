import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
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
    public static final String POSITION_REMOVED_SUCCESS = "удалено из Вашего Новогоднего набора!";
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
                MAIN_MENU_EXIT + LINE);
    }

    void showLotOfPosition() {
        System.out.println(LINE +
                POSITION_MENU_NEED_ACTION +
                LINE +
                POSITION_MENU_1 +
                POSITION_MENU_2 +
                POSITION_MENU_3 + LINE);
    }

    public void showMenuSorryMessage() {
        System.out.println(STARS_LINE + MAIN_MENU_SORRY_MESSAGE + STARS_LINE);
    }

    public void showPositionSorryMessage() {
        System.out.println(STARS_LINE + POSITION_SORRY_MESSAGE + STARS_LINE);
    }

    public void showMenuInputCountOfPosition() {
        System.out.println(LINE + COUNT_POSITION + LINE);
    }


    public int numberPointOfMenu() {
        try {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Что то явно пошло не по нашему плану.. Давайте попробуем еще раз?");
            return -2;
        }
    }

    public static String getMainMenuAdd() {
        return MAIN_MENU_ADD;
    }

    public static String getMainMenuDelete() {
        return MAIN_MENU_DELETE;
    }

    public static String getMainMenuTotal() {
        return MAIN_MENU_TOTAL;
    }

    public static String getMainMenuExit() {
        return MAIN_MENU_EXIT;
    }

    public static String getMainMenuTitle() {
        return MAIN_MENU_TITLE;
    }

    public static String getMainMenuNeedAction() {
        return MAIN_MENU_NEED_ACTION;
    }

    public static String getLINE() {
        return LINE;
    }

    public static String getPositionMenuNeedAction() {
        return POSITION_MENU_NEED_ACTION;
    }

    public static String getPositionMenu1() {
        return POSITION_MENU_1;
    }

    public static String getPositionMenu2() {
        return POSITION_MENU_2;
    }

    public static String getPositionMenu3() {
        return POSITION_MENU_3;
    }

    public static String getPositionAddedSuccessfully() {
        return POSITION_ADDED_SUCCESSFULLY;
    }

    public static String getPositionSorryMessage() {
        return POSITION_SORRY_MESSAGE;
    }

    public static String getPositionRemovedSuccess() {
        return POSITION_REMOVED_SUCCESS;
    }

    public static String getMainMenuSorryMessage() {
        return MAIN_MENU_SORRY_MESSAGE;
    }

    public static String getTotalOfPosition() {
        return TOTAL_OF_POSITION;
    }

    public static String getStarsLine() {
        return STARS_LINE;
    }

    public static String getByeByeMessage() {
        return BYE_BYE_MESSAGE;
    }

    public static String getCountPosition() {
        return COUNT_POSITION;
    }

    public static void setCountPosition(String countPosition) {
        COUNT_POSITION = countPosition;
    }

    public int returnIdOfPosition() {
        try {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("С этим не шутят. Давайте еще раз! Введите наконец таки число!");
            return 0;
        }


    }

    public int returnCountOfPosition() {
        try {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Помните что надо вводить только число!");
            return 0;
        }
    }
}
