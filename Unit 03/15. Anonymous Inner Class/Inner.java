class Test {
    int a;

    void show() {
        System.out.println("show method in class Test");
    }

    class InnerTest {
        void display() {
            System.out.println("Display In InnerTest");
        }
    }
}

public class Inner {
    public static void main(String[] args) {
        Test T1 = new Test();
        T1.show();
        Test.InnerTest T2 = T1.new InnerTest();
        T2.display();
    }
}
