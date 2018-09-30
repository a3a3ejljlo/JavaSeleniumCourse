import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;

public class Main {
    public static void main(String[] args) throws ExeptionForThisProject, InvalidMidiDataException, MidiUnavailableException {

/*  1) Формируется новогодний подарок.
Он может включать в себя разные сладости (Candy, Jellybean, etc.)
У каждой сладости есть название, вес, цена и свой уникальный параметр.
Необходимо собрать подарок из сладостей.
Найти общий вес подарка, общую стоимость подарка
и вывести на консоль информацию о всех сладостях в подарке.
В подарке может быть много сладостей одного типа.
Из подарка можно добавлять и удалять сладости по определенному типу.
Типов сладостей может быть много (больше двух)
Подумать как задавать вес и стоимость.
Как организовать данные.
Как будет работать алгоритм*/
        Set set = new Set();
        MainMenu mainMenu = new MainMenu();
        boolean isGameover = false;
        startGameLogic(set, mainMenu, isGameover);
    }

    private static void startGameLogic(Set set, MainMenu mainMenu, boolean isGameover) throws ExeptionForThisProject {
        while (!isGameover) {
            mainMenu.startGreeting();
            int menu = mainMenu.numberPointOfMenu();
            if (menu == 1 || menu == 2) {
                mainMenu.showLotOfPosition();
                int id = mainMenu.returnIdOfPosition();
                if (id == 1 || id == 2 || id == 3) {
                    mainMenu.showMenuInputCountOfPosition();
                    int count = mainMenu.returnCountOfPosition();
                    set.doInteractionWithPositions(menu, id, count);
                } else {
                    mainMenu.showPositionSorryMessage();
                }
            } else if (menu == 3) {
                set.setTotal(menu);
            } else if (menu == 4) {
                isGameover = set.isGameover(menu);
            } else {
                mainMenu.showMenuSorryMessage();
            }
        }
    }
}
