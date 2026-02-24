public class Main2 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 10 / a;
            System.out.println(b);
            try {
                if (a == 1)
                    a = a / (a - a);
                else if (a == 2) {
                    int arr[] = { 1, 2 };
                    arr[3] = 200;
                    System.out.println(arr[0] + " " + arr[1]);
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
