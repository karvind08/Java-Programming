import java.util.ArrayList;
import java.util.Iterator;

public class Main7 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Arvind");
        list.add("Yuvaan");
        list.add("Jiya");
        list.add("Duggu");
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
