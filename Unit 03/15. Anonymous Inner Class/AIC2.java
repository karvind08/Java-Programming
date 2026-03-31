class Inner2 {
    void display() {
        System.out.println("display in Inner1");
    }
}

public class AIC2 {
    public static void main(String[] args) {
        Inner2 C2 = new Inner2() {
            void display() {
                System.out.println("Anonymous Class");
            }
        };
        C2.display();
    }
}
