package pack1;

class Example1 {
    public void display() {
        System.out.println("Display in Example1 and Package 1");
    }
}

class Example2 extends Example1 {
    public void show() {
        System.out.println("Show in Example2 and Package 1");
    }
}

public class Main1 extends Example2 {
    public static void main(String[] args) {
        Example2 E = new Example2();
        E.display();
        E.show();
    }
}
