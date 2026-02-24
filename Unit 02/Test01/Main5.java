import java.util.Scanner;

public class Main5 {
    static void display(int a, int b) throws ArithmeticException {
        int r = a / b;
        System.out.println(r);
    }

    static void show() {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = S.nextInt();
        int b = S.nextInt();
        display(a, b);
        S.close();
    }

    public static void main(String[] args) {

        try {
            show();

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
