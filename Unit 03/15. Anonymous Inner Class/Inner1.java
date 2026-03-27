class Test1 {
    int a;

    void show() {
        System.out.println("show method in class Test");
    }

    static class InnerTest1 {
        void display() {
            System.out.println("Display In InnerTest");
        }
    }
}

public class Inner1 {
    public static void main(String[] args) {
        Test1 T1 = new Test1();
        T1.show();
        Test1.InnerTest1 T2 = new Test1.InnerTest1();
        T2.display();
    }
}
