import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch = S.nextInt();
        int r = 0;
        int res = switch (ch) {
            case 1 -> r = 10;
            case 2 -> r = 20;
            default -> r = 100;
        };
        System.out.println(res);
        System.out.println(r);
        S.close();
    }
}
