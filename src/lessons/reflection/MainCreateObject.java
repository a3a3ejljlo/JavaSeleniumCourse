package lessons.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

public class MainCreateObject {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, ClassNotFoundException, NoSuchMethodException {
        Constructor<?> constructor = Class.forName("lessons.reflection.ConcreteClass").getConstructor(int.class);

        System.out.println(Arrays.toString(constructor.getParameterTypes()));

        Object o = constructor.newInstance(10);
        Method method = o.getClass().getMethod("method1", null);

        method.invoke(o, null);
        Constructor<?> hashMapConstructor = Class.forName("java.util.HashMap").getConstructor(null);

        System.out.println(Arrays.toString(hashMapConstructor.getParameterTypes()));

        HashMap<String, String> hashMap = (HashMap<String, String>) hashMapConstructor.newInstance(null);
    }
}
