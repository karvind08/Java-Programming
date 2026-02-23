package pack1;

class Sample1 {
    public static int r = 10;
    public static String name = "Arvind";

    public static void display() {
        System.out.println("Static fields and methods");
    }
}

public class Program1 extends Sample1 {
    public static void main(String[] args) {
        System.out.println(Sample1.r);
        System.out.println(Sample1.name);
        Sample1.display();
    }
}
