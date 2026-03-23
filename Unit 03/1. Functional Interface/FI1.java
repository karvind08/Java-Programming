interface I1 {
    void display();
}

public class FI1 implements I1 {

    public void display() {
        System.out.println("Display method");
    }

    public static void main(String[] args) {
        FI1 F1 = new FI1();
        F1.display();
    }
}
