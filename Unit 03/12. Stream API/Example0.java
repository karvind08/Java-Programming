import java.util.*;
import java.util.stream.Stream;

public class Example0 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("The list is: " + list);
        Stream<Integer> data = list.stream();
        data.forEach((n) -> System.out.println(n));
    }
}
