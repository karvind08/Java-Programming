import java.util.*;
import java.util.stream.Collectors;

public class Alpha {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arvind", "Yuvaan", "Amit", "Jiya");
        List<String> res = names.stream()
                .filter(name -> name.startsWith("A"))
                .map(name -> name.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(res);
    }
}
