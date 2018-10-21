package lessons.jenerics;

import java.util.*;

public class JenericHomework {

    public JenericHomework() {
    }



    public <T> void printArray(List<T> arrays) {
        System.out.println(arrays);;
    }

    public static <T extends Object & Comparable<? super T>> T max(Collection<? extends T> coll) {
        Iterator<? extends T> i = coll.iterator();
        T candidate = i.next();

        while (i.hasNext()) {
            T next = i.next();
            if (next.compareTo(candidate) > 0)
                candidate = next;
        }
        System.out.println(candidate);
        return candidate;
    }
}
