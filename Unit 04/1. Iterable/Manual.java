import java.util.*;

public class Manual {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Spliterator<Integer> spl1 = list.spliterator();
        Spliterator<Integer> spl2 = spl1.trySplit(); // split into two parts
        System.out.println("First half:");
        spl1.forEachRemaining(n -> System.out.print(n));
        System.out.println("\nSecond half:");
        spl2.forEachRemaining(n -> System.out.print(n));
    }
}
