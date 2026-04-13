import java.util.ArrayList;
import java.util.Spliterator;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        Spliterator<Integer> sit = list.spliterator();
        sit.tryAdvance(System.out::println);
        sit.forEachRemaining(System.out::println);
    }
}
