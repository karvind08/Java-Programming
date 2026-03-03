import java.util.function.BiFunction;

class Multiplication {
    public static int toMultiply(int x, int y) {
        return x * y;
    }
}

public class Example1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> product = Multiplication::toMultiply;
        int pr = product.apply(12, 6);
        System.out.println("The final product is: " + pr);
    }
}