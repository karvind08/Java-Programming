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

    }
}
