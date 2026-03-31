import java.util.*;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 2, 13, -4, 5);
        list.stream().map(n -> n * 2).forEach(n -> System.out.println(n));
        list.forEach(n -> System.out.println(n));
    }
}
