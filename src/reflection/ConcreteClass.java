package reflection;

public class ConcreteClass extends BaseClass implements BaseInterface {

    public int publicInt;

    private String privateString = "private string";

    protected boolean protectedBoolean;

    Object defaultObject;

    public ConcreteClass(int i) {

        this.publicInt = i;

    }

    @Override

    public void method1() {
        System.out.println("Method1 impl.");




        }

    @Override
    public int method2(String str) {
        return 0;
    }
}
