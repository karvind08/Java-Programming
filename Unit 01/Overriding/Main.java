class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void display() {
        super.display();
        System.out.println("Child Class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child C1 = new Child();
        C1.display();
    }

}
