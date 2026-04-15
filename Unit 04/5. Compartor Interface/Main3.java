import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student3 {
    int r, age;
    String name;

    Student3(int r, int age, String name) {
        this.r = r;
        this.name = name;
        this.age = age;
    }
}

public class Main3 {
    public static void main(String[] args) {
        List<Student3> list = new ArrayList<>();
        list.add(new Student3(1, 10, "Bhanu"));
        list.add(new Student3(4, 22, "Arvind"));
        list.add(new Student3(10, 18, "Chandu"));
        list.add(new Student3(9, 30, "Sandeep"));
        Collections.sort(list, (S1, S2) -> S2.age - S1.age);
        for (Student3 i : list) {
            System.out.println(i.r + " " + i.age + " " + i.name);
        }

    }
}