interface Inter2 {
    Class2 display(int a);
}

class Class2 {
    int a;

    Class2(int a) {
        this.a = a;
    }

    void show() {
        System.out.println("The value of a: " + a);
    }
}

public class Method2 {
    public static void main(String[] args) {
        Inter2 I1 = Class2::new; // now matches no-arg constructor
        Class2 C2 = I1.display(10);
        C2.show();

    }
}
