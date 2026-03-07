class A {
    void displayinclasswhichisgood() {
        System.out.println("Display in class A");
    }
}

class B extends A {
    @Override
    void displayinclasswhichisgood() {
        System.out.println("Display in class B");
    }
}

public class Main {
    public static void main(String[] args) {
        B B1 = new B();
        B1.displayinclasswhichisgood();
    }
}
