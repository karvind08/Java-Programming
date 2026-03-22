import java.util.*;

public class ListToArrayExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Integer[] array = list.toArray(new Integer[0]);
        System.out.println("Array elements:");
        for (Integer number : array) {
            System.out.println(number);
        }
    }
}