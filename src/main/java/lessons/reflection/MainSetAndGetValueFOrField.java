package lessons.reflection;

import java.lang.reflect.Field;

public class MainSetAndGetValueFOrField {
    public static void main(String[] args) throws IllegalAccessException, ClassNotFoundException, NoSuchFieldException {
        Field field = Class.forName("lessons.reflection.ConcreteClass").getDeclaredField("privateString");

        field.setAccessible(true);

        ConcreteClass objTest = new ConcreteClass(1);
        System.out.println(field.get(objTest));

        field.set(objTest,"private string updated");
        System.out.println(field.get(objTest));


    }
}
