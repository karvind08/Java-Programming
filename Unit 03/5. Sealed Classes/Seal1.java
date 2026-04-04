sealed class Test1 permits User1 {
    void display() {
        System.out.println("Display in Test1");
    }
}

non-sealed class User1 extends Test1 {
    void user() {
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
        Test1 T1 = new Test1();
        T1.display();
        User1 U1 = new User1();
        U1.display();
        U1.user();
        U1.show();
        Example E1 = new Example();
        E1.visible();
        E1.display();
        E1.user();
        E1.show();
    }
}
