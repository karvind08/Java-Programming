interface Test1 {
    void display();
}

class Sample1 {
    void show() {
        System.out.println("Show method in class Sample1");
    }
}

public class Main0 {
    public static void main(String[] args) {
        Sample1 S1 = new Sample1();
        Test1 T1 = S1::show;
        T1.display();
    }
}
