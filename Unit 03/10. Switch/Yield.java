import java.util.Scanner;

public class Yield {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your choice");
        int ch = S.nextInt();
        String name = " ";
        name = switch (ch) {
            case 1:
                yield "Arvind";
            case 2:
                yield "Yuvaan";
            default:
                yield "Advika";
        };
        System.out.println(name);
        S.close();
    }
}
