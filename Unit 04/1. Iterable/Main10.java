import java.util.ArrayList;
import java.util.Spliterator;

public class Main10 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Spliterator<Integer> SP1 = list.spliterator();
        Spliterator<Integer> SP2 = SP1.trySplit();
        System.out.println("First: ");
        SP1.tryAdvance(System.out::println);
        System.out.println("First Remaining: ");
        SP1.forEachRemaining(n -> System.out.print(n + " "));
        System.out.println("\nSecond: ");
        SP2.tryAdvance(System.out::print);
        System.out.println("\nSecond Remaining: ");
        SP2.forEachRemaining(n -> System.out.print(n + " "));
    }
}
