import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your choice");
        String ch = S.nextLine();
        switch (ch) {
            case "A":
                System.out.println("Case A");
                break;
            case "B":
                System.out.println("Case B");
                break;
            default:
                System.out.println("Default");
        }
        S.close();
    }
}
