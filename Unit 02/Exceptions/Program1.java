
public class Program1 {
    public static void main(String[] args) {
        int a[] = { 1 };
        try {
            System.out.println(a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("End of code");
        }
    }
}
