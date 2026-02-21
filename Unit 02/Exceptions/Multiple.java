public class Multiple {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 10;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurs");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Parent Exception occurs");
        }
        System.out.println("End of the code");
    }

}
