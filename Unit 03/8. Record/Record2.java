record Person(int r, String name) {

    Person() {
        this(0, "");
    }

}

public class Record2 {
    public static void main(String[] args) {
        Person P1 = new Person(1, "Arvind");
        Person P2 = new Person(1, "Yuvaan");
        Person P3 = new Person();
        System.out.println(P1);
        System.out.println(P2);
        System.out.println(P3);
    }
}
