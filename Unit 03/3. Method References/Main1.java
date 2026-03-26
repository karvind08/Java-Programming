import java.util.*;

public class Main1 {
    public static void print(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arvind", "Yuvaan");
        names.forEach(Main1::print);
    }
}
