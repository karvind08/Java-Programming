class MyClass {
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }
}

public class Main3 {
    public static void main(String[] args) {
        // Calling via class
        MyClass.greet("Arvind");

        // Calling via instance (possible, but not recommended)
        MyClass obj = new MyClass();
        obj.greet("Arvind");
    }
}