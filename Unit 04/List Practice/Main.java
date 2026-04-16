import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(2);
        list.sort(Comparator.naturalOrder());
        list.sort(Comparator.reverseOrder());
        System.out.println(list);
        // Collections.sort(list);

    }
}
