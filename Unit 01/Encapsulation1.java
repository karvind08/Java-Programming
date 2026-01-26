class Student {
    int r;
    String name;
}

public class Encapsulation1 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Roll No: " + s.r);
        System.out.println("Name: " + s.name);
    }
}