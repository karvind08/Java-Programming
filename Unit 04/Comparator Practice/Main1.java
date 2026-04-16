import java.util.*;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(4, "Bhavya"));
        list.add(new Student(3, "Chavya"));
        list.add(new Student(1, "Arvind"));
        Collections.sort(list, (S1, S2) -> S1.roll - S2.roll);
        for (Student s : list) {
            System.out.println(s.roll + " " + s.name);
        }

    }
}
