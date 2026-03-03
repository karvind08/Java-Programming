interface Interface1 {
    void display();
}

public class Example {
    public void myMethod() {
        System.out.println("method reference in java 8");
    }

    public static void main(String[] args) {
        Example obj = new Example();
        // Reference to the method using the object of the class myMethod
        Interface1 ref = obj::myMethod;
        // Calling the method inside the functional interface Display
        ref.display();
    }
}
