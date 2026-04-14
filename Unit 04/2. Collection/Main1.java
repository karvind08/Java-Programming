import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main1 {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for (Integer i : list)
            System.out.println(i);
        list.remove(10);
        System.out.println("After removal");
        Iterator<Integer> I1 = list.iterator();
        while (I1.hasNext()) {
            System.out.println(I1.next());
        }
    }
}
