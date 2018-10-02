import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMenu {

    private static final LinkedHashMap<String, String> menuList = new LinkedHashMap<String, String>() {
        {
            put("",
                    "\n\tМеню генератора Новогоднего подарка!\n\n" +
                            "_____________________________________________________\n" +
                            "\tВведите номер пункта меню и нажмите Enter: \n" +
                            "_____________________________________________________");
            put("1.", "Добавить позицию в Новогодний подарок");
            put("2.", "Удалить позицию из Новогоднего подарка");
            put("3.", "Вывести итоговую информацию о Новогоднем подарке");
            put("4.", "Выйти из программы\n" + "_____________________________________________________"
            );
        }
    };

    static LinkedHashMap<String, String> positionList = new LinkedHashMap<String, String>() {
        {
            put("", "\tВведите номер нужной вам позиции и нажмите Enter: \n"+
                    "_____________________________________________________");
            put("1.", "Chokolate");
            put("2.", "Candy");
            put("3.", "Jellybean");
        }
    };


    public void showPositionFromList() {
        for (Map.Entry<String, String> stringStringEntry : positionList.entrySet()) {
            System.out.println(stringStringEntry.getKey() + stringStringEntry.getValue());
        }
    }

    public void showMenuFromList() {
        for (Map.Entry<String, String> stringStringEntry : menuList.entrySet()) {
            System.out.println(stringStringEntry.getKey() + stringStringEntry.getValue());
        }
    }

    public static final String LINE = "\n_____________________________________________________\n";
    public static final String POSITION_ADDED_SUCCESSFULLY = "добавилось в Ваш Новогодний набор! \nПродолжайте набирать сладости пока не лопнет пакет!";
    public static final String POSITION_SORRY_MESSAGE = "\n\tТаких позиций нет в меню выбора позиций";
    public static final String POSITION_REMOVED_SUCCESS = "удалено из Вашего Новогоднего набора!";
    public static final String MAIN_MENU_SORRY_MESSAGE = "\n" +
            "Укажите существующий пункт меню!!!!!\n" +
            "\n";
    public static final String TOTAL_OF_POSITION = "\n\tИтоговая информация по составу набора: ";
    public static final String STARS_LINE = "\n**********************************************\n";
    public static final String BYE_BYE_MESSAGE = "\n**********************************************" +
            "\n**********************************************" +
            "\n\tСчастливого Рождества и Нового года...\n" +
            "\n**********************************************" +
            "\n**********************************************";
    public static String COUNT_POSITION = "\tВведите количество, которое Вам необходимо";

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
            System.out.println("Попробуйте ввести число...\n");
            showMenuFromList();
            return numberPointOfMenu();
        }
    }

    public int returnIdOfPosition() {
        try {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Попробуйте ввести число...\n");
            showPositionFromList();
            return returnIdOfPosition();
        }
    }

    public int returnCountOfPosition() {
        try {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            return Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Помните что надо вводить только число...\n");
            return returnCountOfPosition();
        }
    }
}
