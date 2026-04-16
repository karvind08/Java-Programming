import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(2);
        System.out.println("original list: " + list);
        System.out.println(list.contains(2));
    }
}