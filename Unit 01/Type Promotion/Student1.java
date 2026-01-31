public class Student1 {
    String name;
    int roll;
    static String collName = "MMMEC";
    static int stcount = 0;

    Student1(String n, int r) {
        this.name = n;
        this.roll = r;
        stcount++;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("College Name: " + collName);
        System.out.println("Student Count: " + stcount);
    }
}
