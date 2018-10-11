package lessons.reflection;

import java.lang.reflect.Modifier;

public class Main6 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(Class.forName("lessons.reflection.BaseInterface").getPackage().getName());

        System.out.println(Modifier.toString(ConcreteClass.class.getModifiers()));

        System.out.println(Modifier.toString(Class.forName("lessons.reflection.BaseInterface").getModifiers()));
    }
}
