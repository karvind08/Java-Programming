class OuterClass {
    void display() {
        System.out.println("Outer method");
    }

    class InnerClass {
        void show() {
            System.out.println("Inner Class");
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        OuterClass A1 = new OuterClass();
        A1.display();
        OuterClass.InnerClass B1 = A1.new InnerClass();
        B1.show();

    }
}
