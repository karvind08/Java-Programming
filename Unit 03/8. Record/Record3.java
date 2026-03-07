import java.util.Scanner;

record Person(int r, String name) {

    public Person {
        if (r == 0)
            throw new IllegalArgumentException();
    }

}

public class Record3 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the roll number: ");
        int r = S.nextInt();
        System.out.println("Enter the name: ");
        String n = S.next();
        try {
            Person P1 = new Person(r, n);
            System.out.println(P1);
        } catch (IllegalArgumentException e) {
            System.out.println("Roll number can't be zero");
        } finally {
            S.close();
        }

    }
}
