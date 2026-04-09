import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterate {
    public static void main(String[] args) {
        List<Integer> res = Stream.iterate(1, i -> i + 1)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
