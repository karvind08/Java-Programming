import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Iterate1 {
    public static void main(String[] args) {
        List<String> list = Stream.generate(() -> "Arvind")
                .limit(10)
                .collect(Collectors.toList());

        list.forEach(n -> System.out.print(n + " "));
    }
}
