package jenericHomework;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        JenericHomework jenericHomework = new JenericHomework();

        List<Integer> integers = new ArrayList<Integer>() {};
        integers.add(1);
        integers.add(2);
        integers.add(11);
        integers.add(44);


        List<Double> doubles = new ArrayList<Double>() {};
        doubles.add(131.34);
        doubles.add(331.34);
        doubles.add(4341.34);
        doubles.add(731.34);

        List<String> strings = new ArrayList<String>() {};
        strings.add("a");
        strings.add("dsdsa");
        strings.add("agfhfhgfh");
        strings.add("asfsdfsdfdsfds");
        System.out.println("____________PRINT_ANY_ARRAYLISTS_____________________");
        jenericHomework.printArray(doubles);
        jenericHomework.printArray(integers);
        jenericHomework.printArray(strings);
        System.out.println();
        System.out.println("________________________MAX_VALUE_FROM_ARRAY_LIST_______________");
        JenericHomework.max(integers);
    }
}
