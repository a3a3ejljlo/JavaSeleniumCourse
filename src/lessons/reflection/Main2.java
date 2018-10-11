package lessons.reflection;
//TODO в процессе осмысления
import java.util.Arrays;

import static java.lang.Class.forName;

public class Main2 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> concreteClass = ConcreteClass.class;
        concreteClass = new ConcreteClass(5).getClass();


        try {
            concreteClass = Class.forName("lessons.reflection.ConcreteClass");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println(concreteClass.getCanonicalName());

        Class<?> booleanClass = boolean.class;
        System.out.println(booleanClass.getCanonicalName());

        Class<?> cDouble = Double.TYPE;
        System.out.println(cDouble.getCanonicalName());

        Class<?> cDoubleArray = Class.forName("[D");
        System.out.println(cDoubleArray.getCanonicalName());

        Class<?> twoDStringArray = String[][].class;
        System.out.println(twoDStringArray.getCanonicalName());


        Class<?>[] classes = concreteClass.getClasses();
        System.out.println(Arrays.toString(classes));


    }
}