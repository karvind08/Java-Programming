interface A {
    void show();
}

class B implements A {
    void display() {
        System.out.println("I am in display of class A");
    }

    public void show() {
        System.out.println("Show in class B");
    }
}

public class HybridTest {

}
