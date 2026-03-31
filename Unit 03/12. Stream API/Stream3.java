import java.util.*;
import java.util.stream.Collectors;

public class Stream3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 3, 8, 2);
        List<Integer> res = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        res.forEach(n -> System.out.print(n + " "));
        System.out.println("\nOrinial List");
        list.forEach(n -> System.out.print(n + " "));
    }
}
