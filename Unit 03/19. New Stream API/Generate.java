import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Generate {
    public static void main(String[] args) {
        List<Integer> res = Stream.generate(() -> 10)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
