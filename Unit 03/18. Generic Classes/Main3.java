class Outer1 {
    void display() {
        System.out.println("Outer");
    }

    static class Inner1 {
        void show() {
            System.out.println("Inner Class");
        }
    }
}

public class Main3 {
    public static void main(String[] args) {
        Outer1 A = new Outer1();
        A.display();
    }
}
