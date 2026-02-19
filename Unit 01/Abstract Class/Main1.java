abstract class Sample {
    Sample() {
        System.out.println("Hello");
    }

    abstract void show();
}

class A extends Sample {
    A() {
        System.out.println("Class A Constructor");
    }

    void show() {
        System.out.println("Show in class A");
    }
}

public class Main1 {
    public static void main(String[] args) {
        A A1 = new A();
        A1.show();
    }

}
