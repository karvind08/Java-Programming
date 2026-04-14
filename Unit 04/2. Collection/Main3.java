import java.util.ArrayList;
import java.util.Collection;

public class Main3 {
    public static void main(String[] args) {
        Collection<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        for (Integer i : list)
            System.out.println(i);
        boolean res = list.isEmpty();
        if (res == true)
            System.out.println("List is empty");
        else
            System.out.println("List is not empty");
    }
}
