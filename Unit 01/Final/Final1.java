final class A {
    void fun() {
        System.out.println("Fun1");
    }
}

class B extends A {
    void display() {
        System.out.println("Display");
    }
}

public class Final1 {
    public static void main(String[] args) {
        B B1 = new B();
        B1.display();
        B1.fun();
    }

}
