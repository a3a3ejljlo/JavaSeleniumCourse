package myprogramme;

import myprogramme.todolist.Uniquable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException, InstantiationException {

        Chokolate chokolate = new Chokolate("Chokolate", 2, 100.45);
        Jellybean jellybean = new Jellybean();
        Candy candy = new Candy("Candy", 1, 4.58);

        System.out.println(candy.getClass().getMethod("getRandomFirm").getAnnotation(SweetAnnotation.class).unique());

    }
}
