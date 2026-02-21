public class Nested {
    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("length:" + a);
            int b = 10 / a;
            System.out.println("b: " + b);
            try {
                if (a == 1)
                    a = a / (a - a);
                if (a == 2) {
                    int c[] = { 1 };
                    c[3] = 10;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
