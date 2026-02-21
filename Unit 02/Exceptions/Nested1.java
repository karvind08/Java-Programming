public class Nested1 {
    static void nesttry(int a) {
        try {
            if (a == 1)
                a = a / (a - a);
            if (a == 2) {
                int c[] = { 1 };
                c[2] = 10;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("length:" + a);
            int b = 10 / a;
            System.out.println("b: " + b);
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
