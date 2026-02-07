class Parent3 {
    static void staticMethod() {

        System.out.println("Parent static method");
    }

    void instanceMethod() {

        System.out.println("Parent instance method");
    }
}

class Child3 extends Parent3 {

    static void staticMethod() {

        // Hides Parent's static method
        System.out.println("Child static method");
    }

    void instanceMethod() {

        // Overrides Parent's instance method
        System.out.println("Child instance method");
    }
}

public class ABC {

    public static void main(String[] args) {

        Parent3 p = new Child3();

        // Calls Parent's static method (hiding)
        p.staticMethod();
        // Calls Child's overridden instance method
        p.instanceMethod();
    }
}