import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch = S.nextInt();
        switch (ch) {
            case 1 -> System.out.println("Case 1");
            case 2 -> System.out.println("Case 2");
            default -> System.out.println("Default");
        }
        S.close();
    }
}
