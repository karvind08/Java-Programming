import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 22, -3, 4, 15);
        System.out.println("List: " + list);
        Stream<Integer> S = list.stream();
        Stream<Integer> S1 = S.sorted();
        S1.forEach(n -> System.out.println(n));
    }
}
