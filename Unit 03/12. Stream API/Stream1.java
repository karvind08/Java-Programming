import java.util.*;

public class Stream1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 2, 13, -4, 5);
        list.stream()
                .map(n -> n * 2)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\nThe original List: ");
        list.forEach(n -> System.out.print(n + " "));
    }
}
