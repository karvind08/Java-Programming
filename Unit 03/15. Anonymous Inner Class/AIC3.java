abstract class Inner3 {
    abstract void display();
}

class Child3 extends Inner3 {
    void display() {
        System.out.println("Display in Child3");
    }
}

public class AIC3 {
    public static void main(String[] args) {
        Child3 C3 = new Child3();
        C3.display();
    }
}
