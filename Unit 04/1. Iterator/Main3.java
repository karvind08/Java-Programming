import java.util.ArrayList;
import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Black");
        colors.add("White");
        Iterator<String> I1 = colors.iterator();
        while (I1.hasNext()) {
            System.out.println(I1.next());
        }
    }
}
