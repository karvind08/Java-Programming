import java.util.*;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

class SortbyRoll implements Comparator<Student> {
    public int compare(Student S1, Student S2) {
        return S1.roll - S2.roll;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(4, "Bhavya"));
        list.add(new Student(4, "Chavya"));
        list.add(new Student(4, "Arvind"));
        Collections.sort(list, new SortbyRoll());
        for (Student s : list) {
            System.out.println(s.roll + " " + s.name);
        }

    }
}
