interface A {
    void display();
}

interface B {
    void show();
}

class Sample implements A, B {
    public void display() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("World");
    }
}

public class Main {
    public static void main(String[] args) {
        Sample S = new Sample();
        S.display();
        S.show();
    }
}
