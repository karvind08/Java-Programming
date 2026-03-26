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

public class Main0 {
    public static void main(String[] args) {
        Sample1 S1 = (double d) -> d * d;
        double res = S1.square(2.4d);
        System.out.println(res);
        int r1 = Sample1.div(6, 3);
        System.out.println(r1);
        int r2 = Sample1.mul(5, 3);
        System.out.println(r2);
        int r3 = S1.add(10, 20);
        System.out.println(r3);
        int r4 = S1.sub(50, 40);
        System.out.println(r4);
    }
}
