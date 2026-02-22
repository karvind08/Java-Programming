public class ThrowDemo1 {
    static void riskyOperation() {
        try {
            throw new ArithmeticException("Something went wrong");
        } catch (ArithmeticException e) {
            throw e;
        }
    }

    public static void main(String[] args) {
        try {
            riskyOperation();
        } catch (Exception e) {
            System.out.println("Caught again in main: " + e.getMessage());
        }
    }
}