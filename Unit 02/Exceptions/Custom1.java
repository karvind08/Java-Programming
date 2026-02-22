// Custom exception class

import java.util.Scanner;

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

public class Custom1 {

    // Method declares it may throw AgeException
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18 or above!");
        } else {
            System.out.println("Access granted.");
        }
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age = S.nextInt();
        try {
            checkAge(age); // Will throw AgeException
        } catch (AgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            S.close();
        }
    }
}