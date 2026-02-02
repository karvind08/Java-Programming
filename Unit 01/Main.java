class EvenOdd {
    int number; // instance variable

    // Constructor
    EvenOdd(int num) {
        number = num;
    }

    // Method to check even/odd
    void checkEvenOdd() {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        EvenOdd obj1 = new EvenOdd(10);
        obj1.checkEvenOdd();

        EvenOdd obj2 = new EvenOdd(7);
        obj2.checkEvenOdd();
    }
}