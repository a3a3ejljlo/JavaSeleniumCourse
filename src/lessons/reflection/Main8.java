package lessons.reflection;

import java.lang.reflect.Type;
import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) throws ClassNotFoundException {
        Type[] interfaces = Class.forName("java.util.HashMap").getGenericInterfaces();

        System.out.println(Arrays.toString(interfaces));

        System.out.println(Arrays.toString(Class.forName("java.util.HashMap").getGenericInterfaces()));
    }
}
