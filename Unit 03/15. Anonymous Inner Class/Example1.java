abstract class Diamond<T> {
    abstract T display(T a, T b);
}

public class Example1 {
    public static void main(String[] args) {
        Diamond<Integer> D1 = new Diamond<>() {
            Integer display(Integer a, Integer b) {
                return a + b;
            }
        };
        // System.out.println(D1.display(10, 20));
        int a = D1.display(10, 60);
        System.out.println(a);
    }
}
