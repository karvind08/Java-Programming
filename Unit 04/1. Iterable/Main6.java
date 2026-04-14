import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Iterable<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        list.forEach(n -> System.out.println(n));
    }
}
