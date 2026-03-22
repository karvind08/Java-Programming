import java.util.ArrayList;
import java.util.List;

public class ListUpdate {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Arvind");
        list.add("Yuvaan");
        list.add("Java");
        System.out.println("The list is: " + list);
        list.set(1, "Hello");
        System.out.println("The Updated list is: " + list);

    }
}
