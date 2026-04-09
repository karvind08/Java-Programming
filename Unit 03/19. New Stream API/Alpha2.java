import java.util.*;

public class Alpha2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arvind", "Yuvaan", "Amit", "Jiya");
        Optional<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .findAny()
                .map(name -> name.toUpperCase());

        System.out.println(res.get());
    }
}
