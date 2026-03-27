import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Consumer<Integer> Obj = new Consumer<Integer>() {
            public void accept(Integer n) {
                System.out.print(n);
            }
        };
        list.forEach(Obj);
    }
}
