package lessons.annotation;

import java.lang.reflect.Method;

public class Meta {

    @MyAnno(str = "Пример аннотации", val = 123)
    public static void myMeth() {
        Meta ob = new Meta();


        Class<?> c = ob.getClass();

        Method method = null;
        try {
            method = c.getMethod("myMeth");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        MyAnno anno = method.getAnnotation(MyAnno.class);

        System.out.println(anno.str()+" "+anno.val());
    }

    public static void main(String[] args) {
        myMeth();
    }

}
