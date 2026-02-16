interface A {
    default void show() {
        System.out.println("Show from A");
    }
}

interface B extends A {
    @Override
    default void show() {
        System.out.println("Show from B");
    }
}

interface C extends A {
    @Override
    default void show() {
        System.out.println("Show from C");
    }
}

// New interface that extends A but does NOT override show()
interface PureA extends A {
}

class D implements B, C, PureA {
    @Override
    public void show() {
        // You can now call A's original implementation via PureA
        // PureA.super.show(); // prints "Show from A"
        B.super.show(); // prints "Show from B"
        C.super.show(); // prints "Show from C"
        System.out.println("Show in D");
    }
}

public class Diamond2 {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}