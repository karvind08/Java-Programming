import java.util.Scanner;

public class Main5 {
    static void display(int a, int b) throws ArithmeticException {
        int r = a / b;
        System.out.println(r);
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
