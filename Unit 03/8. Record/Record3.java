record Person(int r, String name) {

    public Person {
        if (r == 0)
            throw new IllegalArgumentException();
    }

}

public class Record3 {
    public static void main(String[] args) {
        try {
            Person P1 = new Person(0, "Arvind");
            System.out.println(P1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
