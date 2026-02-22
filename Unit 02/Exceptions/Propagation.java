// Propagation of Exceptions

class Propagation {

    static void riskyDivision() throws ArithmeticException {
        int result = 10 / 0; // Will throw ArithmeticException
        System.out.println("Result: " + result);
    }

    // Method calls riskyDivision and also declares throws
    static void callDivision() throws ArithmeticException {
        riskyDivision();
    }

    public static void main(String[] args) {
        try {
            callDivision(); // Exception propagates up to here
        } catch (ArithmeticException e) {
            System.out.println("Handled in main: " + e.getMessage());
        }
    }
}