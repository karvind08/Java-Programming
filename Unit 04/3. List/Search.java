import java.util.*;

public class Search {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("banana");
        int index = words.indexOf("banana");
        System.out.println("The first occurrence of 'banana' is at index " + index);
        int lastIndex = words.lastIndexOf("banana");
        System.out.println("The last occurrence of 'banana' is at index " + lastIndex);
    }
}