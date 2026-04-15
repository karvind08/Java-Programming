import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student2 {
    int r, age;
    String name;

    Student2(int r, int age, String name) {
        this.r = r;
        this.name = name;
        this.age = age;
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(1, 10, "Bhanu"));
        list.add(new Student1(4, 22, "Arvind"));
        list.add(new Student1(10, 18, "Chandu"));
        list.add(new Student1(9, 30, "Sandeep"));
        Collections.sort(list, (S1, S2) -> S1.age - S2.age);
        for (Student1 i : list) {
            System.out.println(i.r + " " + i.age + " " + i.name);
        }

    }
}