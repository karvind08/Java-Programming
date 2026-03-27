abstract class Example {
    abstract int sum(int a, int b);
}

public class Main0 {
    public static void main(String[] args) {
        Example E = new Example() {
            int sum(int a, int b) {
                return a + b;
            }
        };
        int res = E.sum(10, 20);
        System.out.println("The sum is: " + res);
    }
}
