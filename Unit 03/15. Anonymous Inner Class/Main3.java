abstract class Test<T> {
    abstract T display(T a, T b);
}

public class Main3 {
    public static void main(String[] args) {
        Test<Integer> T1 = new Test<>() {
            Integer display(Integer a, Integer b) {
                return a + b;
            }
        };
        // System.out.println(T1.display(10, 20));
        int r = T1.display(2, 3);
        System.out.println(r);
    }
}
