import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20, 12, 3, 14);
        Stream<Integer> data = list.stream();
        Stream<Integer> mapdata = data.map(n -> n * 2);
        mapdata.forEach(n -> System.out.print(" " + n));
    }
}
