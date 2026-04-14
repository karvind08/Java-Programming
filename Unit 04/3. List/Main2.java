import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        Integer[] Arr = list.toArray(new Integer[0]);
        for (Integer i : Arr)
            System.out.println(i);
    }
}
