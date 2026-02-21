public class Main11 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println(a);
            int b = 10 / a;
            System.out.println("b:" + b);
            int c[] = { 1, 2 };
            c[1] = 100;
            System.out.println("Array Element:" + c[0] + " " + c[1]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of code");
        }
    }
}
