import java.util.Scanner;

public class Main12 {
    static void divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        System.out.println("Result: " + (a / b));
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = S.nextInt();
        System.out.println("Enter Second Number: ");
        int b = S.nextInt();
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            S.close();
        }
    }

}