import java.util.*;
import java.util.function.Consumer;

public class FReach1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> C1 = (Integer n) -> System.out.print(n + " ");
        list.forEach(C1);
    }
}
