import java.io.FileInputStream;
import java.util.Scanner;

public class Main0 {
    public static void main(String[] args) {

        try (Scanner S = new Scanner(System.in);
                FileInputStream FIS = new FileInputStream("demo.txt")) {
            System.out.println("Enter the number: ");
            int a = S.nextInt();
            System.out.println(a);
            byte[] b = FIS.readAllBytes();
            String str = new String(b);
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
