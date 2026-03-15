class InvalidMark extends Exception {
    public InvalidMark(String message) {
        super(message);
    }
}

public class Main3 {
    void grade(int[] marks) throws InvalidMark {
        int s = 0;
        for (int i : marks)
            if (i < 0 || i > 100)
                throw new InvalidMark("Invalid Marks");
            else
                s = s + i;
        System.out.println("Total: " + s);
        double per = s / 5.0;
        System.out.println("Per: " + per);
        if (per >= 90)
            System.out.println("A+");
        else if (per > 80 && per < 90)
            System.out.println("A");
        else if (per > 60 && per < 79)
            System.out.println("B");
        else if (per > 40 && per < 59)
            System.out.println("C");
        else
            System.out.println("Fail");

    }

    public static void main(String[] args) {
        // int marks[] = new int[5];
        int[] marks = { 10, 80, 90, 100, 67 };
        Main3 M = new Main3();
        try {
            M.grade(marks);
        } catch (InvalidMark e) {
            System.out.println(e.getMessage());
        }

    }
}
