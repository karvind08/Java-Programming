import java.util.Map; // <-- important
import java.util.HashMap;

public class Map1 {
    public static void main(String[] args) {
        Map<String, Integer> M = new HashMap<String, Integer>();
        M.put("One", 1);
        M.put("Two", 2);
        System.out.println(M);
    }
}
