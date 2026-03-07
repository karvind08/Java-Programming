import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch = S.nextInt();
        String name = " ";
        String res = switch (ch) {
            case 1 -> name = "Arvind";
            case 2 -> name = "Yuvaan";
            default -> name = "Advika";
        };
        System.out.println(res);
        S.close();
    }
}
