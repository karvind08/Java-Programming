import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch = S.nextInt();
        String name = " ";
        name = switch (ch) {
            case 1 -> "Arvind";
            case 2 -> "Yuvaan";
            default -> "Advika";
        };
        System.out.println(name);
        S.close();
    }
}
