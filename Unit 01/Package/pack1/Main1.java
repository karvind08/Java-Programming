package pack1;

class Example1 {
    public void display() {
        System.out.println("Display in Example1 and Package 1");
    }
}

public class Main1 extends Example1 {
    public static void main(String[] args) {
        Example1 E = new Example1();
        E.display();
    }
}
