package lessons.reflection;

import java.lang.reflect.Method;
import java.util.Arrays;

public class MainMethods {
    public static void main(String[] args) throws ClassNotFoundException {
        Method[] publicMethods = Class.forName("lessons.reflection.ConcreteClass").getMethods();
        System.out.println(Arrays.toString(publicMethods));

    }
}
