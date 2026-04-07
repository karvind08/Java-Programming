import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("List: " + list);
        Stream<Integer> S = list.stream();
        S.forEach(n -> System.out.print(n + " "));
    }
}
