package lessons.reflection;

import java.lang.reflect.Field;

public class MainWorkWithFields {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Field field = Class.forName("lessons.reflection.ConcreteClass").getField("interfaceInt");
        Class<?> fieldClass = field.getDeclaringClass();

        System.out.println(fieldClass.getCanonicalName());
        System.out.println(field);


    }
}
