public class Student {
    String name;
    int roll;
    static String collName = "MMMEC";
    static int stcount = 0;

    void getdata(String n, int r) {
        this.name = n;
        this.roll = r;
        stcount++;
    }

    void display() {
        System.out
                .println(
                        "Name: " + name + " Roll: " + roll + " College Name: " + collName + " Student Count: "
                                + stcount);
    }

    public static void main(String[] args) {
        Student S1 = new Student();
        S1.getdata("Arvind", 43);
        S1.display();
        System.out.println("\nThe total students are: " + Student.stcount);
        Student S2 = new Student();
        S2.getdata("Yuvaan", 5);
        S2.display();
        System.out.println("\nThe total students are: " + Student.stcount);
    }
}
