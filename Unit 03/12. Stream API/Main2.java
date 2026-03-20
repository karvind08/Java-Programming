import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(20, 12, 3, 14);
        Stream<Integer> data = list.stream();
        Stream<Integer> datas = data.sorted();
        datas.forEach(n -> System.out.print(" "+n));
    }
}
