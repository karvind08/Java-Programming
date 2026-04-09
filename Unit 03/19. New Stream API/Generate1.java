import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Generate1 {
    public static void main(String[] args) {
        List<String> names = Stream.generate(() -> "Arvind")
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
