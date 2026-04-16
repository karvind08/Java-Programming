import java.util.*;

class Student1 {
    int r;
    String name;

    public int getR() {
        return r;
    }

    public String getName() {
        return name;
    }

    Student1(int r, String name) {
        this.r = r;
        this.name = name;
    }

}

public class Main3 {
    public static void main(String[] args) {
        List<Student1> list = new ArrayList<>();
        list.add(new Student1(3, "Bob"));
        list.add(new Student1(9, "Arvind"));
        list.add(new Student1(30, "Yuvaan"));
        list.sort(Comparator.comparing(S -> S.name));
        for (Student1 s : list) {
            System.out.println(s.r + " " + s.name);
        }
    }
}
