class Demo {
    int a, b;

    Demo() {
        a = 0;
        b = 0;
        System.out.println("Default Constructor: " + a + " " + b);
    }

    Demo(int a) {
        this.a = a;
        System.out.println("2nd Construtor: " + a);
    }

    Demo(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("3rd Constructor: " + a + " " + b);
    }
}

public class Main {
    public static void main(String[] args) {
        Demo D1 = new Demo();
        Demo D2 = new Demo(10);
        Demo D3 = new Demo(10, 20);
    }
}
