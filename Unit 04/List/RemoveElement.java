import java.util.*;

public class RemoveElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("The list is: " + list);
        list.remove(3);
        System.out.println("The Updated list is: " + list);
        // list.remove(new Integer(20)); // deprecated
        // System.out.println("The Updated list is: " + list);
    }
}
