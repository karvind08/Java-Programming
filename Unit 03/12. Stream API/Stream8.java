import java.util.*;

public class Stream8 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 3, 8, 2);
        int r = list.stream()
                .reduce(0, (n, i) -> n + i);

        System.out.println("\nThe sum is: " + r);
        System.out.println("\nOriginal List");
        list.forEach(n -> System.out.print(n + " "));
    }
}
