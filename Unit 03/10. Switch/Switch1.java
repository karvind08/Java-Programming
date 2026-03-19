import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int r = S.nextInt();
        switch (r) {
            case 1 -> System.out.println("Case 1");
            case 2 -> System.out.println("Case 2");
            default -> System.out.println("Default");
        }
        S.close();
    }
}
