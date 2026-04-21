import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>(2, 5);
        System.out.println(v.size());
        v.add(10);
        v.add(10);
        v.add(10);
        System.out.println(v);
        System.out.println(v.size());
    }
}
