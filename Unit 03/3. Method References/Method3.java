interface Inter3 {
    void display();
}

class Class3 {
    Class3() {
        System.out.println("Constructor");
    }
}

public class Method3 {
    public static void main(String[] args) {
        Inter3 I3 = Class3::new;
        I3.display();
    }
}
