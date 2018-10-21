package lessons.reflection;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class MainConstructor {
    public static void main(String[] args) throws ClassNotFoundException {
        Constructor<?>[] publicConstructors = Class.forName("lessons.reflection.ConcreteClass").getConstructors();

        System.out.println(Arrays.toString(publicConstructors));

    }
}
