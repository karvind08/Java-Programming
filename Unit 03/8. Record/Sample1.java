record Employee1(int eid, String name) {
    public Employee1() {
        this(0, null);
    }
}

public class Sample1 {
    public static void main(String[] args) {
        Employee1 E1 = new Employee1(10, "Yuvaan");
        System.out.println(E1);
        Employee1 E2 = new Employee1();
        System.out.println(E2);

    }
}
