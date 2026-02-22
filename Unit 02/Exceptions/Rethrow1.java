import java.util.Scanner;

public class Rethrow1 {
    static void display(int a, int b) {
        if (b == 0)
            throw new ArithmeticException("Cant divide by 0");
        else {
            int res = a / b;
            System.out.println(res);
        }
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = S.nextInt();
        int b = S.nextInt();
        try {
            display(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            S.close();
            System.out.println("End of code");
        }

    }

}
