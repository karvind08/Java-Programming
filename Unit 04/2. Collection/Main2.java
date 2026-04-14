import java.util.ArrayList;
import java.util.Collection;

public class Main2 {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for (Integer i : list)
            System.out.println(i);
        list.clear();
        System.out.println("After clear");
        System.out.println(list);
    }
}
