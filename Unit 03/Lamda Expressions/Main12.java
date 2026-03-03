interface MyInter4 {
    void print();
}

class Myclass1 {
    static int b = 500; // static variable

    void show() {
        MyInter4 t = () -> {
            System.out.println("b =  " + b);
        };
        t.print();
    }
}

public class Main12 {
    public static void main(String arg[]) {
        Myclass1 test = new Myclass1();
        test.show();
        System.out.println(Myclass1.b);
    }
}