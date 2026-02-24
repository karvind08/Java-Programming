import java.util.Scanner;

public class Main4 {
    static void display(int a, int b) {
        try {
            if (b == 0)
                throw new ArithmeticException("Can't divide by zero");
            else {
                int res = a / b;
                System.out.println(res);
            }
        } catch (ArithmeticException e) {
            throw e;
        } finally {
            System.out.println("End of display method");
        }
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = S.nextInt();
        int b = S.nextInt();
        try {
            display(a, b);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        S.close();
    }
}
