import java.util.ArrayList;
import java.util.List;

public class Main7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(100);
        list.add(1);
        int ind = list.get(1);
        System.out.println(ind);
        System.out.println(list.get(2));
    }
}
