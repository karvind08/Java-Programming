import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int a[] = new int[5];
        for (int i = 0; i < 5; i++) {
            a[i] = S.nextInt();
        }
        System.out.println("\nThe array is: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(a[i]);
        }
        try {
            System.out.println(a[7]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            S.close();
        }

    }

}
