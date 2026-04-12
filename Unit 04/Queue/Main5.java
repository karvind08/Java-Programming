import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;

public class Main5 {
    public static void main(String[] args) {
        Queue<String> Q1 = new LinkedList<>();
        Q1.add("C");
        Q1.add("C++");
        Q1.add("Java");
        System.out.println(Q1);
        Iterator<String> itr = new Iterator<>();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
