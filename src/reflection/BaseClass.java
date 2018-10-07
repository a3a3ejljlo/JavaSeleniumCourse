package reflection;

public class BaseClass {
    public int baseInt;

    private static void method3() {
        System.out.println("Method3");
    }
    public  int method4() {
        System.out.println("Method4");
        return 0;
    }

    private static int method5() {
        System.out.println("Method5");
        return 1;
    }

 void method6() {
        System.out.println("Method6");
    }

    public class BaseClassInnerClass {

    }

    public enum BaseClassMemberEnum {}
    
}
