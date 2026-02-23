package pack1;

class Sample1 {
    public static int r = 10;
    public static String name = "Arvind";
}

public class Program1 extends Sample1 {
    static int age = 30;

    public static void main(String[] args) {
        System.out.println(Sample1.r);
        System.out.println(Sample1.name);
    }
}
