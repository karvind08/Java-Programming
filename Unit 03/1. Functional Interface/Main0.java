interface Sample1 {
    double square(double n);

    default int add(int a, int b) {
        return a + b;
    }

    default int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mul(int a, int b) {
        return a * b;
    }
}

public class Main0 implements Sample1 {
    public double square(double r) {
        return r * r;
    }

    public static void main(String[] args) {
        Main0 M1 = new Main0();
        int r1 = Sample1.div(6, 3);
        System.out.println(r1);
        int r2 = Sample1.mul(5, 3);
        System.out.println(r2);
        int r3 = M1.add(10, 20);
        System.out.println(r3);
        int r4 = M1.sub(50, 40);
        System.out.println(r4);
        double r5 = M1.square(5);
        System.out.println(r5);

    }
}
