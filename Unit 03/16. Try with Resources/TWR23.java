import java.util.Scanner;

public class TWR23 {
    public static void main(String[] args) {
        try (Scanner S = new Scanner(System.in);) {
            System.out.println("Enter the Number: ");
            int a = S.nextInt();
            System.out.println("The number is " + a);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}