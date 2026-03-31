interface Calc {
    double display(double a, double b);
}

class Classic {
    static double add(double a, double b) {
        return a + b;
    }

    static double sub(double a, double b) {
        return a + b;
    }

    static double mul(double a, double b) {
        return a + b;
    }

    static double div(double a, double b) {
        return a + b;
    }
}

public class MethodCal {
    public static void main(String[] args) {
        Calc C1 = Classic::add;
        double res = C1.display(10.3, 3.4);
        System.out.println(res);
    }
}
