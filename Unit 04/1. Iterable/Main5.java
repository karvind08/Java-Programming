import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        Spliterator<Integer> sit = list.spliterator();
        sit.tryAdvance(n -> System.out.println(n));
        System.out.println("Remaining data: ");
        sit.forEachRemaining(n -> System.out.println(n));
    }
}
