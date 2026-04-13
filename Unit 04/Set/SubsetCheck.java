import java.util.*;

public class SubsetCheck {
    public static void main(String[] args) {
        Set<Integer> y = new HashSet<>();
        y.add(10);
        y.add(20);
        y.add(30);
        y.add(40);

        Set<Integer> x = new HashSet<>();
        x.add(20);
        x.add(30);

        // Print both sets
        System.out.println("Set Y: " + y);
        System.out.println("Set X: " + x);

        // Check if X is a subset of Y
        if (y.containsAll(x)) {
            System.out.println("X is a subset of Y");
        } else {
            System.out.println("X is NOT a subset of Y");
        }
    }
}
