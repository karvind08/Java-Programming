import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter The first Number");
        int a = S.nextInt();
        System.out.println("Enter The Second Number");
        int b = S.nextInt();
        try {
            int res = a / b;
            System.out.println("The result is: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Divison by zero not possible");
        }
        System.out.println("End of Program");
        S.close();
    }
}
