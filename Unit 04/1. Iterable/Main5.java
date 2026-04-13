import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        Spliterator<Integer> sit = list.spliterator();
        sit.tryAdvance(System.out::println);
        System.out.println("Remaining data: ");
        sit.forEachRemaining(System.out::println);
    }
}
