import java.util.ArrayList;
import java.util.List;

class Student {
    int r, age;
    String name;

    Student(int r, int age, String name) {
        this.r = r;
        this.name = name;
        this.age = age;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, 10, "Bhanu"));
        list.add(new Student(4, 22, "Arvind"));
        list.add(new Student(10, 18, "Chandu"));
        list.add(new Student(9, 30, "Sandeep"));
        for (Student i : list) {
            System.out.println(i.r + " " + i.name);
        }

    }
}