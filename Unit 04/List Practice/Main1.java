import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(2);
        System.out.println("original list: " + list);
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + list);
    }
}
