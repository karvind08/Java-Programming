import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(2);
        list.add(5);
        list.add(3);
        System.out.println(list);
        list.remove(1);
        System.out.println("The Updated list: " + list);
    }
}
