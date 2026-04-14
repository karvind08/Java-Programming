import java.util.ArrayList;
import java.util.Spliterator;

public class Main9 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Spliterator<Integer> SI = list.spliterator();
        SI.tryAdvance(n -> System.out.println(n));
        System.out.println("Remaining: ");
        SI.forEachRemaining(n -> System.out.print(n + " "));
    }
}
