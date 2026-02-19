abstract class Sample {
    void display() {
        System.out.println("Normal Method");
    }

    final void method() {
        System.out.println("Final method");
    }

    abstract void show();
}

class A extends Sample {
    void show() {
        System.out.println("Show in class A");
    }
}

public class Main {
    public static void main(String[] args) {
        A A1 = new A();
        A1.show();
        A1.display();
        A1.method();
    }

}
