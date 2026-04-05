import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println(list);
        Stream<Integer> data = list.stream();
        data.forEach(n -> System.out.print(n));
        data.forEach(n -> System.out.print(n));
    }
}
