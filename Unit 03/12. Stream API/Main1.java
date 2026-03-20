import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list);
        Stream<Integer> data = list.stream();
        long count = data.count();
        System.out.println(count);
        data.forEach(n -> System.out.print(n));
    }
}
