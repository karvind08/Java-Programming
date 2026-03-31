import java.util.Scanner;

public class TWR2 {
    public static void main(String[] args) {
        Scanner S = null;
        try {
            S = new Scanner(System.in);
            System.out.println("Enter the Number: ");
            int a = S.nextInt();
            System.out.println("The number is " + a);
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            S.close();
        }

    }
}
