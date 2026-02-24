public class Main1 {
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 10 / a;
            System.out.println("b: " + b);
            int arr[] = { 1, 2 };
            arr[1] = 200;
            System.out.println(arr[0] + " " + arr[1]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of code");
        }
    }
}
