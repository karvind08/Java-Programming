public class Main7 {
    public static void main(String[] args) {
        int a = 15;
        int b = 0;
        try {
            int res = a / b;
            System.out.println("The result is: " + res);
        } catch (ArithmeticException e) {
            System.out.println("Divison by zero not possible");
        }
        System.out.println("End of Program");
    }
}
