import java.util.LinkedList;
import java.util.Queue;

public class Main2 {
    public static void main(String[] args) {
        Queue<Integer> Q1 = new LinkedList<>();
        Q1.add(10);
        Q1.add(20);
        Q1.add(30);
        System.out.println(Q1);
        Q1.remove(20);
        System.out.println("After removing 20: " + Q1);
    }
}
