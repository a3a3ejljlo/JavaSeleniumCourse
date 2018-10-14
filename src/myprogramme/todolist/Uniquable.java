package myprogramme.todolist;

import myprogramme.Sweets;

import java.lang.reflect.Method;
import java.util.Arrays;

public interface Uniquable <T extends String> {

    default String ret(Sweets sweets) throws ClassNotFoundException, NoSuchMethodException {
        Class<?> sweets1 = Class.forName(sweets.getClass().getCanonicalName()).getClass();
        Method[] methods = sweets1.getMethods();
        Arrays.stream(methods).forEach(System.out::println);
        return "dsds";
    };

    T getUniqueParametr(T anyType);
}
