package reflection;

public class Main3 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> superClass = Class.forName("reflection.ConcreteClass").getSuperclass();

        System.out.println(superClass);
        System.out.println(Object.class.getSuperclass());
        System.out.println(String[][].class.getSuperclass());

    }
}
