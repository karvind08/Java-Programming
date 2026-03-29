abstract class Test1<T> {
    abstract T display(T a, T b);
}

public class Main4 {
    public static void main(String[] args) {
        Test1<Double> T1 = new Test1<>() {
            Double display(Double a, Double b) {
                return a + b;
            }
        };
        // System.out.println(T1.display(10, 20));
        double r = T1.display(2.5, 3.5);
        System.out.println(r);
    }
}
