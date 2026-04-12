import java.util.LinkedList;
import java.util.Queue;

public class Main4 {
    public static void main(String[] args) {
        Queue<String> Q1 = new LinkedList<>();
        Q1.add("C");
        Q1.add("C++");
        Q1.add("Java");
        System.out.println(Q1);
        System.out.println("Head using peek: " + Q1.peek());
        System.out.println("Head using peek: " + Q1.element());
        System.out.println("After operations: " + Q1);
    }
}
