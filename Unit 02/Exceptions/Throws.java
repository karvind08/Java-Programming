import java.util.Scanner;

public class Throws {
    static void divide(int a, int b) throws ArithmeticException {
        if (b == 0)
            throw new ArithmeticException("Can't divide by 0");
        else {
            int res = a / b;
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a = S.nextInt();
        int b = S.nextInt();
        try {
            divide(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            S.close();
        }

    }
}
