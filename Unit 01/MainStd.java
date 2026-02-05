public class MainStd {
    public static void main(String[] args) {
        Student S1 = new Student();
        S1.getdata(1, "Arvind");
        S1.display();
        System.out.println("Object:" + Student.count);
    }

}
