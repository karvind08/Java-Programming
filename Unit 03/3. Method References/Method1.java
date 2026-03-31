interface Inter1 {
    void display();
}

class Class2 {
    static void show() {
        System.out.println("static show in class2");
    }
}

public class Method1 {
    public static void main(String[] args) {
        Inter1 I1 = Class2::show;
        I1.display();
    }
}
