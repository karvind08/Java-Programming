import java.util.*;

class Linkedlist01 {
    public static void main(String args[]) {
        LinkedList<Integer> LL = new LinkedList<Integer>();
        LL.add(1);
        LL.add(3);
        LL.add(4);
        LL.add(1, 2);
        System.out.println(LL);
    }
}