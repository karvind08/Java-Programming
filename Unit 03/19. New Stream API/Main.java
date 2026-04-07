import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("List: " + list);
        Stream<Integer> S = list.stream();
        long len = S.count();
        System.out.println("The elements are: " + len);
        // S.forEach(n -> System.out.print(n + " "));
    }
}
