import java.util.*;
import java.util.stream.Collectors;

public class Distinct {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Arvind", "Amit", "Arvind", "Jiya", "Amit");
        List<String> uniqueNames = names.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueNames);
    }
}