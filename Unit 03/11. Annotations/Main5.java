class Example {
    void display(String name) {
        System.out.println("Display in Example" + name);
    }
}

class Sample extends Example {
    @Override
    void display(String name) {
        System.out.println("Display in Sample " + name);
    }
}

public class Main5 {
    public static void main(String[] args) {
        Sample S = new Sample();
        S.display("Hello");

    }
}
