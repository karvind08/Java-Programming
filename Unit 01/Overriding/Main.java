class Parent {
    static void display() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child Class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child.display();
        Parent.display();
    }

}
