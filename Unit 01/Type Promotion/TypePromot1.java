public class TypePromot1 {
    // void add(int a, int b) {
    // System.out.println("The sum is " + (a + b));
    // }

    void add(int a, int b, int c) {
        System.out.println("The sum is " + (a + b + c));
    }

    /* This is creating ambiguity */
    // void add(long a, int b) {
    // System.out.println("The sum is " + (a + b));
    // }

    void add(int a, long b) {
        System.out.println("The sum is " + (a + b));
    }

}
