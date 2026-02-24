import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = S.nextInt();
        int b = S.nextInt();
        try {
            int res = a / b;
            System.out.println(res);
            int arr[] = { 1, 2 };
            arr[3] = 200;
            System.out.println(arr[0] + " " + arr[1]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            S.close();
            System.out.println("End of code");
        }

    }
}
