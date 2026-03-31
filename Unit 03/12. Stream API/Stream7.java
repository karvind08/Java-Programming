import java.util.*;
import java.util.stream.Collectors;

public class Stream7 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 3, 8, 2);
        List<Integer> res = list.stream()
                .filter(n -> n % 2 != 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("\nThe odd numbers in sorted order are: ");
        res.forEach(n -> System.out.print(n + " "));
        System.out.println("\nOriginal List");
        list.forEach(n -> System.out.print(n + " "));
    }
}
