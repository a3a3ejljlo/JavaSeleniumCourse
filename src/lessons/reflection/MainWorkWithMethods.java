package lessons.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainWorkWithMethods {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = Class.forName("java.util.HashMap").getMethod("put", Object.class, Object.class);

        System.out.println(Arrays.toString(method.getParameterTypes()));

        System.out.println(method.getReturnType());

        System.out.println(Modifier.toString(method.getModifiers()));

        Map<String, String> hm = new HashMap<>();
        method.invoke(hm, "key", "value");
        System.out.println(hm);

        Method method2 = Class.forName("lessons.reflection.BaseClass").getDeclaredMethod("method3", null);
        method2.setAccessible(true);
        method2.invoke(null, null);
    }
}
