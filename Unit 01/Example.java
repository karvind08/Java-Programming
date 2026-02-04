class Static {
    int r;
    String name;
    static String College = "MMMEC";
    static int count = 0;

    void getdata(int r, String name) {
        this.r = r;
        this.name = name;
        count++;
    }

    void display() {
        System.out.println("Roll: " + r);
        System.out.println("Name: " + name);
        System.out.println("College: " + College);
        System.out.println("Objects: " + count);
    }
}

public class Example {
    public static void main(String[] args) {
        Static S1 = new Static();
        S1.getdata(1, "Arvind");
        S1.display();
        System.out.println("The college: " + Static.College);
        System.out.println("Object: " + Static.count);
    }
}
