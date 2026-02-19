abstract class Calculator {
    abstract void display();
}

class Add extends Calculator {
    void display() {
        System.out.println("Addition");
    }
}

class Sub extends Calculator {
    void display() {
        System.out.println("Subtraction");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Add A = new Add();
        A.display();
        Sub S = new Sub();
        S.display();
    }
}
