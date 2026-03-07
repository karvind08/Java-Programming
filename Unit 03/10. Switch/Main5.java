import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch = S.nextInt();
        int res = switch (ch) {
            case 1 -> 10;
            case 2 -> 20;
            default -> 100;
        };
        System.out.println(res);
        S.close();
    }
}
