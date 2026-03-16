import java.util.Scanner;

class InvalidMark extends Exception {
    InvalidMark(String message) {
        super(message);
    }
}

class Student {
    void grade(int[] Marks) throws InvalidMark {
        int s = 0;
        for (int i : Marks) {
            if (i < 0 || i > 100)
                throw new InvalidMark("Invalid Marks");
            else
                s = s + i;
            System.out.println("The total marks are: " + s);
            if (s >= 90)
                System.out.println("A+");
            else if (s >= 80 && s < 90)
                System.out.println("A");
            else if (s >= 60 && s <= 79)
                System.out.println("B");
            else if (s >= 40 && s < 60)
                System.out.println("C");
            else
                System.out.println("Fail");
        }

    }
}

public class UserDefinedException {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Student S1 = new Student();
        int[] Marks = new int[5];
        System.out.println("Enter the Marks: ");
        for (int i = 0; i < 5; i++)
            Marks[i] = S.nextInt();
        System.out.println("The Marks are: ");
        for (int i = 0; i < 5; i++)
            System.out.println(Marks[i]);
        try {
            S1.grade(Marks);
        } catch (InvalidMark e) {
            System.out.println(e.getMessage());
        } finally {
            S.close();
        }
    }
}
