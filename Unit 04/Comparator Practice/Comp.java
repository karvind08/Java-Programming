import java.util.*;

class Student3 {
    int age;
    String name;
    double marks;

    Student3(int age, String name, double marks) {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

}

public class Comp {
    public static void main(String[] args) {
        List<Student3> list = new ArrayList<>();
        list.add(new Student3(2, "Abhishek", 71.54));
        list.add(new Student3(42, "Priyashil", 69.54));
        list.add(new Student3(9, "Arvind", 64.50));
        // list.sort(Comparator.comparingInt(S -> S.age));
        list.sort(Comparator.comparingInt(S -> S.age));
        for (Student3 i : list) {
            System.out.println(i.age + " " + i.name + " " + i.marks);
        }

    }
}
