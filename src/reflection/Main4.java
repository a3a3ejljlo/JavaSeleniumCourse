package reflection;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?>[] explitClasses = Class.forName("reflection.BaseClass").getDeclaredClasses();
        System.out.println(Arrays.toString(explitClasses));
    }
}
