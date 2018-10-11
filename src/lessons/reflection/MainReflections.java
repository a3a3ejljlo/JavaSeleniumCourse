package lessons.reflection;

import java.lang.reflect.Field;
import java.util.Arrays;

public class MainReflections {
    public static void main(String[] args) throws ClassNotFoundException {
        Field[] publicFields = Class.forName("lessons.reflection.ConcreteClass").getFields();

        System.out.println(Arrays.toString(publicFields));
    }
}
