package lessons.annotation;

import javafx.scene.paint.Stop;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cl = Class.forName("lessons.annotation.Cookies").getClass();

        if (!cl.isAnnotationPresent(ControlledObject.class)) {
            System.err.println("no annotation");

        }
        System.out.println("class annotated; name - " + cl.getAnnotation(ControlledObject.class));

        boolean hasStart = false;
        boolean hasStop = false;
        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(StartObject.class)) {
                hasStart = true;
            }

            if (method.isAnnotationPresent(StopObject.class)) {
                hasStop = true;
            }
            if (hasStart && hasStop) {
                break;
            }

            System.out.println("Start annotation - " + hasStart + "; Stop annotation - " + hasStop);
            System.out.println(Arrays.toString(method.getAnnotations()));
        }
    }
}
