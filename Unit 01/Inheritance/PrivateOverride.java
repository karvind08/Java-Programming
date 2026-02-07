class Parent4 {
    private void display() {
        System.out.println("Parent Private display()");
    }
}

class Child4 extends Parent4 {
    void display() {
        System.out.println("child display");
    }
}

public class PrivateOverride {
    public static void main(String[] args) {
        Child4 C = new Child4();
        C.display();
    }
}
