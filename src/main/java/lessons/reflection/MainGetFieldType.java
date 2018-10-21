package lessons.reflection;

import java.lang.reflect.Field;

public class MainGetFieldType {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        Field field = Class.forName("lessons.reflection.ConcreteClass").getField("publicInt");
        Class<?> fieldType = field.getType();
        System.out.println(fieldType.getCanonicalName());



        ConcreteClass obj = new ConcreteClass(5);
        try {
            field.setInt(obj, 10);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(field.get(obj));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
