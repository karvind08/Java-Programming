class OuterClass1 {
    void display() {
        System.out.println("Display in OuterClass1");
    }

    static class InnerClass1 {
        void show() {
            System.out.println("show in Innerclass1");
        }
    }
}

public class Inner6 {
    public static void main(String[] args) {
        OuterClass1 OC1 = new OuterClass1();
        OC1.display();
        OuterClass1.InnerClass1 IC1 = new OuterClass1.InnerClass1();
        IC1.show();
    }
}
