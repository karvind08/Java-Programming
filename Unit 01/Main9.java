class Student1 {
    int r;
    String name;

    Student1(int r, String name) {
        this.r = r;
        this.name = name;
    }

    Student1(Student1 ST) {
        this.r = ST.r;
        this.name = ST.name;
    }

    void display() {
        System.out.println(r);
        System.out.println(name);
    }
}

public class Main9 {
    public static void main(String[] args) {
        Student1 S1 = new Student1(2, "Arvind");
        S1.display();
        Student1 S2 = new Student1(S1);
        S2.display();
    }

}
