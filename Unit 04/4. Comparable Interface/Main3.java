import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(90);
        list.add(9);
        list.add(19);
        list.add(3);
        list.add(6);
        Collections.sort(list);
        System.out.println(list);
    }
}
