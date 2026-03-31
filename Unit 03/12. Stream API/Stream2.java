import java.util.*;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 3, 8, 2);
        List<Integer> res = list.stream()
                .map(n -> n * 2)
                .collect(Collectors.toList());
        res.forEach(n -> System.out.print(n + " "));
        list.forEach(n -> System.out.print(n + " "));
    }
}
