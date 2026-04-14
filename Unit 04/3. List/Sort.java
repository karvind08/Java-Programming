import java.util.*;

public class Sort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println("The sorted list: "+list);
    }
}
