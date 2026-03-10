import java.util.*;

class Linkedlist02 {
    public static void main(String args[]) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        // Updating the element at index 3 to 1000
        ll.set(3, 1000);
        System.out.println(ll);
    }
}