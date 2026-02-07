class Parent2 {
    void display() {
        System.out.println("I am in parent class");
    }
}

class Child2 extends Parent2 {
    void display() {
        System.out.println("I am in Child class");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Child2 C = new Child2();
        C.display();
    }
}
