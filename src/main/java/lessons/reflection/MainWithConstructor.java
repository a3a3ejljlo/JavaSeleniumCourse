package lessons.reflection;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class MainWithConstructor {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException {
        Constructor<?> constructor = Class.forName("lessons.reflection.ConcreteClass").getConstructor(int.class);

        System.out.println(Arrays.toString(constructor.getParameterTypes()));

        Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);
        System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes()));

    }
}
