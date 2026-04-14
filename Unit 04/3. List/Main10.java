import java.util.ArrayList;
import java.util.List;

class Student {
    int r;
    String name;

    Student(int r, String name) {
        this.r = r;
        this.name = name;
    }

    @Override
    public String toString() {
        return r + " " + name;
    }

}

public class Main10 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1, "Arvind"));
        list.add(new Student(2, "Yuvaan"));
        for (Student s : list) {
            System.out.println(s);
        }
        list.remove(0);
        System.out.println("After deletion:");
        list.forEach(n -> System.out.println(n));
    }
}
