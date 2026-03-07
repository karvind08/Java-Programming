record Person(int r, String name) {

}

public class Record {
    public static void main(String[] args) {
        Person P1 = new Person(1, "Arvind");
        Person P2 = new Person(2, "Yuvaan");
        System.out.println(P1.equals(P2));
        System.out.println(P1);
        System.out.println(P2);
    }
}
