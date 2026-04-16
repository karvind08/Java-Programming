import java.util.*;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class Main2 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(4, "Bhavya"));
        list.add(new Student(3, "Chavya"));
        list.add(new Student(1, "Arvind"));
        list.sort(Comparator.comparing(S -> S.name));
        for (Student s : list) {
            System.out.println(s.roll + " " + s.name);
        }

    }
}
