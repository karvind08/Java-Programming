public class Throws1 {

    static void throwone() {
        System.out.println("Inside Throwone");
        throw new ArithmeticException("Throws example");
    }

    public static void main(String[] args) {
        throwone();
    }
}
