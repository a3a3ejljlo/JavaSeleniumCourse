public class Main {
    public static void main(String[] args) {

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
        startGame(set, mainMenu, isGameover);
    }


    private static void startGame(Set set, MainMenu mainMenu, boolean isGameover) {
        while (!isGameover) {
            mainMenu.startGreeting();
            int menu = mainMenu.numberPointOfMenu();
            if (menu == 1 || menu == 2) {
                mainMenu.showLotOfPosition();
                int id = mainMenu.returnIdOfPosition();
                mainMenu.showMenuInputCountOfPosition();
                int count = mainMenu.returnCountOfPosition();
                isGameover = set.doInteractionWithPositions(menu, id, count);
            } else if (menu == 3 || menu == 4) {
                isGameover = set.setTotal(menu);
            } else {mainMenu.showSorryMessage();}
        }
    }
}
