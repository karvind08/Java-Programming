import java.util.*;
import java.util.function.Consumer;

public class FReach {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> C1 = new Consumer<>() {
            public void accept(Integer n) {
                System.out.println(n);
            }
        };
        list.forEach(C1);
    }
}
