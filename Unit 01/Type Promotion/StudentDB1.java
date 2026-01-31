public class StudentDB1 {
    public static void main(String[] args) {
        Student1 S1 = new Student1("Arvind", 43);
        S1.display();
        System.out.println("\nThe total students are: " + Student.stcount);
        Student1 S2 = new Student1("Yuvaan", 5);
        S2.display();
        System.out.println("\nThe total students are: " + Student.stcount);
    }
}
