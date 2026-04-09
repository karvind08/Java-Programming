import java.util.Arrays;
import java.util.List;

public class Peek {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arvind", "Amit", "Jiya");

        names.stream()
                .filter(name -> name.startsWith("A"))
                .peek(name -> System.out.println("Filtered: " + name))
                .map(String::toUpperCase)
                .peek(name -> System.out.println("Mapped: " + name))
                .forEach(n -> System.out.println(n));
    }
}
