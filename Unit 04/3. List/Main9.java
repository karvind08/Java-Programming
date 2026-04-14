import java.util.ArrayList;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(100);
        list.add(1);
        System.out.println(list.size());
        System.out.println(list.contains(0));
        System.out.println(list.hashCode());
    }
}
