import static java.lang.Math.PI;

interface Circle {
    double area(int r);
}

public class Main8 {
    public static void main(String[] args) {
        Circle C1 = (int r) -> PI * r * r;
        double res = C1.area(2);
        System.out.println(res);
    }
}
