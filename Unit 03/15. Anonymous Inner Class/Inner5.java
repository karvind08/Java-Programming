class OuterClass {
    void display() {
        System.out.println("Display method in OuterClass");
    }

    class InnerClass {
        void show() {
            System.out.println("Show method in InnerClass");
        }
    }
}

public class Inner5 {
    public static void main(String[] args) {
        OuterClass OC1 = new OuterClass();
        OC1.display();
        OuterClass.InnerClass IC1 = OC1.new InnerClass();
        IC1.show();
    }
}
