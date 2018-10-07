import java.util.ArrayList;

public class JenericHomework <T>{

    ArrayList<Integer> ints = new ArrayList<Integer>() {{
        ints.add(1);
        ints.add(2);
        ints.add(5);
    }};

    ArrayList<Double> doubles = new ArrayList<Double>(){{
        doubles.add(1.34);
        doubles.add(2.23);
        doubles.add(5.23);
    }};

    ArrayList<String> strings = new ArrayList<String>(){{
        strings.add("ABC");
        strings.add("GHT");
        strings.add("KOOI");
    }};

    public JenericHomework() {
    }

    public static <T> void printArray(ArrayList<T> arrays) {
        System.out.println(arrays);
    }

//    public <T> T printMaxValue(ArrayList<T> arrayList) {
//        T t =  Collections.max(arrayList);
//        return t;
//    }
}
