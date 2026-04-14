import java.util.ArrayList;
import java.util.List;

public class Main5 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(100);
        list.add(20);
        System.out.println(list);
        list.set(4, 30);
        System.out.println("The updated List: " + list);
    }
}
