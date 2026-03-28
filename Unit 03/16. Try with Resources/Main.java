import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        try {
            System.out.println("Enter the number: ");
            int a = S.nextInt();
            System.out.println(a);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            S.close();
        }

    }

}
