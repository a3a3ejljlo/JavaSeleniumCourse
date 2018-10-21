package lessons.reflection;

import java.lang.reflect.TypeVariable;

public class Main7 {
    public static void main(String[] args) {
        TypeVariable<?>[] typeVariables = new TypeVariable[0];
        try {
            typeVariables = Class.forName("java.util.HashMap").getTypeParameters();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (TypeVariable<?> typeVariable : typeVariables) {
            System.out.println(typeVariable.getName());
        }
    }
}
