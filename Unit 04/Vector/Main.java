import java.util.*;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3);
        Vector<Integer> v = new Vector<>(list);
        System.out.println(v.size());
        v.add(10);
        v.add(10);
        v.add(10);
        System.out.println(v);
        System.out.println(v.size());
    }
}
