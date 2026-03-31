class OuterClass1 {
    void display() {
        System.out.println("display in OuterClass1");
    }

    class InnerClass1 {
        void show() {
            System.out.println("show in Innerclass1");
        }
    }
}

public class Inner6 {
    public static void main(String[] args) {
        OuterClass1 OC1 = new OuterClass1();
        OC1.display();
    }
}
