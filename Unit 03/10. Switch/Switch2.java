import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int r = S.nextInt();
        String name = switch (r) {
            case 1 -> "Arvind";
            case 2 -> "Jiya";
            default -> "Yuvaan";
        };
        System.out.println(name);
        S.close();
    }
}
