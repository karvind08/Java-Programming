class InvalidMark extends Exception {
    public InvalidMark(String message) {
        super(message);
    }
}

public class Main3 {
    void grade(int[] marks) throws InvalidMark {
        int s = 0;
        for (int i = 0; i < 5; i++)
            if (i < 0 || i > 100)
                throw new InvalidMark("Invalid Marks");
            else
                s = s + marks[i];
        System.out.println("Total: " + s);
        if (s >= 90)
            System.out.println("A+");
        else if (s > 80 && s < 90)
            System.out.println("A");
        else if (s > 60 && s < 79)
            System.out.println("B");
        else if (s > 40 && s < 59)
            System.out.println("C");
        else
            System.out.println("Fail");

    }

    public static void main(String[] args) {
        // int marks[] = new int[5];
        int[] marks = { 70, 80, 90, 100, 67 };
        Main3 M = new Main3();
        try {
            M.grade(marks);
        } catch (InvalidMark e) {
            System.out.println(e.getMessage());
        }

    }
}
