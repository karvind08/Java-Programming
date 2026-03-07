import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter your choice");
        String ch = S.nextLine();
        switch (ch) {
            case "Monday", "Tuesday", "Wednesday" -> System.out.println("Java Classes");
            case "Thursday", "Friday" -> System.out.println("C++ Classes");
            default -> System.out.println("No Classes");
        }
        S.close();
    }
}
