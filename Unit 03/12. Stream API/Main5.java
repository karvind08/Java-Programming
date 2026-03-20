import java.util.*;
import java.util.stream.*;

class Main5 {
    public static void main(String args[]) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> filteredWords = words.stream()
                .filter(s -> s.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("Words starting with 'a': " + filteredWords);

        List<Integer> wordLengths = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println("Lengths of words: " + wordLengths);

        List<String> sortedWords = words.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted words: " + sortedWords);

        int totalLength = words.stream()
                .mapToInt(String::length)
                .reduce(0, Integer::sum);
        System.out.println("Total length of all words: " + totalLength);
    }
}
