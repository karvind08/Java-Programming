interface Inter4 {
    Class4 display(int a);
}

class Class4 {
    int a;

    Class4(int a) {
        this.a = a;
        System.out.println("The value of a: " + a);
    }
}

public class Method4 {
    public static void main(String[] args) {
        Inter4 I1 = Class4::new; // now matches no-arg constructor
        I1.display(10);
    }
}
