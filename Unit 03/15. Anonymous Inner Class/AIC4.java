abstract class Inner4 {
    abstract void display();
}

public class AIC4 {
    public static void main(String[] args) {
        Inner4 C4 = new Inner4() {
            void display() {
                System.out.println("Anonymous");
            }
        };
        C4.display();
    }
}
