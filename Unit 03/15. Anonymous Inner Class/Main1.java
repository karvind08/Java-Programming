class A {
    void display() {
        System.out.println("Display in class A");
    }
}

class B extends A {
    void display() {
        System.out.println("Display in B");
    }
}

public class Main1 {
    public static void main(String[] args) {
        A A1 = new B();
        A1.display();
    }
}
