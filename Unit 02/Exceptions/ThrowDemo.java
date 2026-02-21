public class ThrowDemo {
    static void display() {
        try {
            throw new NullPointerException("Demo");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
            // throw e;
        }
    }

    public static void main(String[] args) {
        try {
            display();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
