abstract class AbstractClass {
    abstract int sum(int a, int b);
}

class Child extends AbstractClass {
    int sum(int a, int b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Child C1 = new Child();
        int r = C1.sum(10, 20);
        System.out.println("The sum is: " + r);
    }
}
