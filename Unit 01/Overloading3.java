class Example {
    public double sum(int x, double y) {
        double r = x + y;
        return r;
    }

    public int sum(int x, int y) {
        int r = x + y;
        return r;
    }
}

public class Overloading3 {
    public static void main(String[] args) {
        Example E = new Example();
        double r1 = E.sum(10, 20.6);
        int r2 = E.sum(10, 20);
        System.out.println("The sum is " + r1);
        System.out.println("The sum is " + r2);
    }
}
