import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(10);
        hs.add(20);
        hs.add(null);
        hs.add(null);
        System.out.println(hs);
    }
}
