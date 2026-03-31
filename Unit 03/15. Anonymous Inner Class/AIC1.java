class Inner1 {
    void display() {
        System.out.println("display in Inner1");
    }
}

class Child1 extends Inner1 {
    void display() {
        System.out.println("Display in Child1");
    }
}

public class AIC1 {
    public static void main(String[] args) {
        Child1 C1 = new Child1();
        C1.display();
    }
}
