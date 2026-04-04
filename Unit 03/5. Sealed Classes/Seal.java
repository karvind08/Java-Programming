sealed class Test permits User {
    void display() {
        System.out.println("Display in sealed Test");
    }
}

final class User extends Test {
    void display() {
        System.out.println("Display in User");
    }
}

public class Seal {
    public static void main(String[] args) {
        User U1 = new User();
        U1.display();
    }
}
