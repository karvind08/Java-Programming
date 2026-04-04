import java.util.*;

public class Main {
    public static void main(String[] args) {
        Iterable<Integer> numbers = Arrays.asList(1, 2, 3, 4);
        for (Integer I : numbers) {
            System.out.print(I + " ");
        }
    }
}
