import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(2);
        System.out.println("original list: " + list);
        Collections.sort(list, Comparator.reverseOrder());
        System.out.println("Reverse Sorted List: " + list);
    }
}
