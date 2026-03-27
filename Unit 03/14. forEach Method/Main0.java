import java.util.*;
import java.util.function.Consumer;

public class Main0 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> Obj = (Integer n) -> {
            System.out.println(n);
        };
        list.forEach(Obj);
    }
}
