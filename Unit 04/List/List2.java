import java.util.*;

public class List2 {
    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5 };
        List<Integer> list = new ArrayList<>();
        for (Integer element : array) {
            list.add(element);
        }
        System.out.println("Array elements converted to list:");
        for (Integer element : list) {
            System.out.println(element);
        }
    }
}