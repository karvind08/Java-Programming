class A {
    void display() {
        System.out.println("Display in class A");
    }
}

public class Main1 {
    public static void main(String[] args) {
        A A1 = new A() {
            void display() {
                System.out.println("New Display");
            }
        };
        A1.display();
    }
}
