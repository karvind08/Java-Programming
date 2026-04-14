import java.util.ArrayList;
import java.util.List;

class Student {
    int r;
    String name;
    double h;

    Student(int r, String name, double h) {
        this.r = r;
        this.name = name;
        this.h = h;
    }

    @Override
    public String toString() {
        return r + " " + name + " " + h + " ";
    }

}

public class Main10 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Arvind", 5.8d));
        list.add(new Student(2, "Yuvaan", 2.5d));
        for (Student s : list) {
            System.out.println(s);
        }

    }
}
