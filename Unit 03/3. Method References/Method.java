interface Inter {
    void display();
}

class Class1 {
    void show() {
        System.out.println("Show in Class1");
    }
}

public class Method {
    public static void main(String[] args) {
        Class1 C1 = new Class1();
        Inter I1 = C1::show;
        I1.display();
    }
}
