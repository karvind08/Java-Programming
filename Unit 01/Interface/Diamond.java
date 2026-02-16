interface A {
    default void show() {
        System.out.println("Show from A");
    }
}

interface B extends A {
    default void show() {
        System.out.println("Show from B");
    }
}

interface C extends A {
    default void show() {
        System.out.println("Show from C");
    }
}

class D implements B, C {
    public void show() {
        // Choose which parent's method to use
        
        B.super.show();
        // C.super.show();
        System.out.println("Resolved in D");
    }
}

public class Diamond {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
