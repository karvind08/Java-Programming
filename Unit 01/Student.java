public class Student {
    int r;
    String name;
    static String College = "MMMEC";
    static int count = 0;

    void getdata(int r, String name) {
        this.r = r;
        this.name = name;
    }

    void display() {
        System.out.println("Roll No:" + r);
        System.out.println("Name: " + name);
        System.out.println("College" + College);
        System.out.println("Object no: " + count);
    }
}
