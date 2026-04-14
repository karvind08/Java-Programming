import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student1 {
    int r, age;
    String name;

    Student1(int r, int age, String name) {
        this.r = r;
        this.name = name;
        this.age = age;
    }
}

class SortbyAge implements Comparator<Student1> {
    public int compare(Student1 S1, Student1 S2) {
        return S1.age - S2.age;
    }
}

class SortbyName implements Comparator<Student1> {
    public int compare(Student1 S1, Student1 S2) {
        return S1.name.compareTo(S2.name);
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(1, 10, "Bhanu"));
        list.add(new Student1(4, 22, "Arvind"));
        list.add(new Student1(10, 18, "Chandu"));
        list.add(new Student1(9, 30, "Sandeep"));
        Collections.sort(list, new SortbyName());
        for (Student1 i : list) {
            System.out.println(i.r + " " + i.age + " " + i.name);
        }

    }
}