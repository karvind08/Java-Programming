import java.util.*;
import java.util.stream.Collectors;
// import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, -3, 4, 5);
        System.out.println("List: " + list);
        List<Integer> res = list.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        // List<Integer> res = list.stream()
        // .map(n -> n * n)
        // .collect(Collectors.toList());
        System.out.println(res);
    }
}