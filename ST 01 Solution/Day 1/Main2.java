// Step 1: Define custom exception
class InvalidMarkException extends Exception {
    public InvalidMarkException(String message) {
        super(message);
    }
}

public class Main2 {

    // Step 2: Method to take marks and calculate grade
    public static void calculateGrade(int[] marks) throws InvalidMarkException {
        int total = 0;

        // Validate marks
        for (int mark : marks) {
            if (mark < 0 || mark > 100) {
                throw new InvalidMarkException("Invalid mark: " + mark + ". Marks must be between 0 and 100.");
            }
            total += mark;
        }

        // Calculate average
        double average = total / (double) marks.length;

        // Determine grade
        String grade;
        if (average >= 90) {
            grade = "A";
        } else if (average >= 75) {
            grade = "B";
        } else if (average >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }

        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }

    // Step 3: Main method
    public static void main(String[] args) {
        // Example marks array
        int[] marks = { 85, 92, 76, 88, 101 }; // 101 is invalid

        try {
            calculateGrade(marks);
        } catch (InvalidMarkException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}