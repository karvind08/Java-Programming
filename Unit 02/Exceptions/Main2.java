public class Main2 {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a = 6;
        int b = 0;
        try {
            int r = a / b;
            System.out.println("The result is: " + r);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("End of program");

    }
}
