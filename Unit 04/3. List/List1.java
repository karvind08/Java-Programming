import java.util.*;

public class List1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        for (int number : list) {
            System.out.println(number);
        }
    }
}