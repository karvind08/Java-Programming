import java.util.*;
import java.util.stream.Collector;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 7, 3, 8, 2);
        List<Integer> res = list.stream()
                .map(n -> n * 2)
                .collect(Collector.toList());
    }
}
