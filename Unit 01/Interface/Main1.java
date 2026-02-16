interface One {
    int r = 10;
    String name = "Arvind";
}

interface Two {
    void display();
}

interface Example extends One, Two {
    double h = 5.6;

    void show();
}

class Sample implements Example {
    public void display() {
        System.out.println(r);
        System.out.println(name);
        System.out.println(h);
    }

    public void show() {
        System.out.println(h);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Sample S1 = new Sample();
        S1.display();
        S1.show();
    }
}
