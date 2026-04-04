sealed class Test1 permits User1 {
    void display() {
        System.out.println("Display in Test1");
    }
}

non-sealed class User1 extends Test1 {
    void display() {
        System.out.println("Display in Example");
    }

    void show() {
        System.out.println("Show in User1");
    }

}

class Example extends User1 {
    void visible() {
        System.out.println("Visible in Example");
    }
}

public class Seal1 {
    public static void main(String[] args) {
        User1 U1 = new User1();
        U1.display();
    }
}
