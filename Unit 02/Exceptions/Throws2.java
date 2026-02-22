public class Throws2 {

    static void throwone() throws ArithmeticException {
        System.out.println("Inside Throwone");
        throw new ArithmeticException("Throws an exception");
    }

    public static void main(String[] args) {
        try {
            throwone();
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of code");
        }

    }
}
