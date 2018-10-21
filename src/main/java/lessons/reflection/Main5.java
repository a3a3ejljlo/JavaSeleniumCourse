
package lessons.reflection;

public class Main5 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> innerClass = Class.forName("lessons.reflection.ConcreteClass$ConcreteClassDefaultClass");

        System.out.println(innerClass.getDeclaringClass().getCanonicalName());
        System.out.println(innerClass.getEnclosingClass().getCanonicalName());

    }
}

