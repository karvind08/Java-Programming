interface Interface1 {
    void display();
}

public class Example {
    public void myMethod() {
        System.out.println("Method reference in Java");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        // Reference to the method using the object of the class myMethod
        Interface1 ref = obj::myMethod;
        // Calling the method inside the functional interface Display
        ref.display();
    }
}
