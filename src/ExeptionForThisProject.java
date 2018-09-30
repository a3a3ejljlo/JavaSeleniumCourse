public class ExeptionForThisProject extends NumberFormatException {


    public ExeptionForThisProject(String message) {
        //TODO: Как мне вывести этот Exeption?
        System.out.println("Нам очень жаль, но здесь закралась какая то ошибка..");
    }

    public void getMessage(String s) {
        System.out.println(new ExeptionForThisProject(" ") + s);
    }
}
