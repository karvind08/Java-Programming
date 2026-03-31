import java.util.*;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 3, 8, 2);
        List<Integer> res = list.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("\nThe sorted numbers are: ");
        res.forEach(n -> System.out.print(n + " "));
        System.out.println("\nOriginal List");
        list.forEach(n -> System.out.print(n + " "));
    }
}
