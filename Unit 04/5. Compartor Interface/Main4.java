import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student4 {
    int r, age;
    String name;

    Student4(int r, int age, String name) {
        this.r = r;
        this.name = name;
        this.age = age;
    }
}

public class Main4 {
    public static void main(String[] args) {
        List<Student4> list = new ArrayList<>();
        list.add(new Student4(1, 10, "Bhanu"));
        list.add(new Student4(4, 22, "Arvind"));
        list.add(new Student4(10, 18, "Chandu"));
        list.add(new Student4(9, 30, "Sandeep"));
        list.sort(
                Comparator.comparing(Student4::getname)
                        .thenComparingInt(Student4::getage));
        for (Student4 i : list) {
            System.out.println(i.r + " " + i.age + " " + i.name);
        }

    }
}