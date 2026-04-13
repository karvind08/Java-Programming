import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Iterable<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        numbers.forEach((n) -> System.out.println(n));
    }
}
