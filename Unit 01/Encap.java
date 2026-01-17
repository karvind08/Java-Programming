class Student {
    private int r;
    private String name;

    public void getdata(int r, String name) {
        this.r = r;
        this.name = name;
    }

    public void display() {
        System.out.println("Roll No: " + r);
        System.out.println("Name: " + name);
    }
}

public class Encap {
    public static void main(String[] args) {
        Student s = new Student();
        // System.out.println("Roll No: " + s.r);
        // System.out.println("Name: " + s.name);
        s.getdata(101, "John Doe");
        s.display();
    }
}