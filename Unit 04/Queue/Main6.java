import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main6 {
    public static void main(String[] args) {
        Queue<String> Q1 = new LinkedList<>();
        Q1.add("C");
        Q1.add("C++");
        Q1.add("Java");
        System.out.println(Q1);
        System.out.println(Q1.size());
        Iterator<String> itr = Q1.iterator();
        while (itr.hasNext())
            System.out.println(itr.next());
    }
}
