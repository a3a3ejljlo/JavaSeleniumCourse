import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException, NoSuchFieldException {

        Constructor<?> constructor = Class.forName("Chokolate").getConstructor();

        Object myObject = constructor.newInstance();

        Method method = myObject.getClass().getMethod("setQuality");
        method.invoke("NICELY", null);

        Field field = myObject.getClass().getField("quality");
    }

}
