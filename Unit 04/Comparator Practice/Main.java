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

class SortbyName implements Comparator<Student> {
    public int compare(Student S1, Student S2) {
        return S1.name.compareTo(S2.name);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(4, "Bhavya"));
        list.add(new Student(3, "Chavya"));
        list.add(new Student(1, "Arvind"));
        Collections.sort(list, new SortbyName());
        for (Student s : list) {
            System.out.println(s.roll + " " + s.name);
        }

    }
}
