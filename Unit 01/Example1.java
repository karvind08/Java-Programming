class Inheritance1 {
    int a, b;

    void showab() {
        System.out.println("a and b: " + a + " " + b);
    }
}

class Inheritance2 extends Inheritance1 {
    int c;

    void showc() {
        System.out.println("c: " + c);
    }

    void sum() {
        System.out.println("The sum is: " + (a + b + c));
    }
}

public class Example1 {
    public static void main(String args[]) {
        // Inheritance1 I1 = new Inheritance1();
        Inheritance2 I2 = new Inheritance2();
        I2.a = 10;
        I2.b = 20;
        I2.showab();
        I2.c = 30;
        I2.showc();
        I2.sum();
    }
}