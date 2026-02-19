interface A {
    int n = 10;

    void display();
}

class B implements A {
    public void display() {
        System.out.println("Hello");
    }
}

public class Test1 {
    public static void main(String[] args) {
        B B1 = new B();
        B1.display();
        System.out.println(B.n);
        // int m = B.n++;
        System.out.println(A.n);
    }
}
