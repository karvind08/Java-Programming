import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

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
        Iterator<Integer> I1 = list.iterator();
        while (I1.hasNext()) {
            System.out.println(I1.next());
        }
    }
}
