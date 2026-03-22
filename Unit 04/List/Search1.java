import java.util.*;

public class Search1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("banana");
        int index = words.indexOf("Banana");
        System.out.println("The first occurrence of 'banana' is at index " + index);
    }
}