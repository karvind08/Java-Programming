sealed class A permits B {
    void displayA() {
        System.out.println("Display in class A");
    }
}

final class B extends A {
    void displayB() {
        System.out.println("Display in class B");
    }
}

public class Main {
    public static void main(String[] args) {
        B B1 = new B();
        A A1 = new A();
        A1.displayA();
        B1.displayA();
        B1.displayB();
    }
}