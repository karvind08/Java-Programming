import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Iterate {
    public static void main(String[] args) {
        List<Integer> list = Stream.iterate(1, i -> i + 1)
                .limit(10)
                .collect(Collectors.toList());
        list.forEach(n -> System.out.println(n + " "));
    }
}
