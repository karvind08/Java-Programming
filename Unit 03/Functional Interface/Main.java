interface Sample {
    // abstract method
    int calculate(int val);
}

// public class
public class Main {
    public static void main(String[] args) {

        // implementing the abstract method of the interface
        Sample solution = (int val) -> val + 51;
        int r = solution.calculate(10);
        // calling the method
        // System.out.println("Ans = " + solution.calculate(51));
        System.out.println(r);
    }
}