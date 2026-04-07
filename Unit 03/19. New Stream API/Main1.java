import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, -3, 4, 5);
        System.out.println("List: " + list);
        list.stream().map(n -> n * n).forEach(n -> System.out.println(n));
    }
}