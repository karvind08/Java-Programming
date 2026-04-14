import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        // for (Integer i : list)
        // System.out.println(i);
        list.forEach(n -> System.out.println(n));
    }
}
