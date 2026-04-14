import java.util.ArrayList;
import java.util.List;

class Employee {
    int eid;
    String name;
    double sal;

    Employee(int eid, String name, double sal) {
        this.eid = eid;
        this.name = name;
        this.sal = sal;
    }

}

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(6, "Arvind", 50000));
        list.add(new Employee(12, "Yuvaan", 20000));
        list.add(new Employee(1, "Jiya`", 30000));
    }
}
