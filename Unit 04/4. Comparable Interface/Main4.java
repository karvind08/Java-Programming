import java.util.ArrayList;
import java.util.List;

class Student {
    int r;
    String name;

    Student(int r, String name) {
        this.r = r;
        this.name = name;
    }
}

public class Main4 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Bhanu"));
        list.add(new Student(2, "Arvind"));
        for (Student i : list) {
            System.out.println(i.r + " " + i.name);
        }

    }
}
