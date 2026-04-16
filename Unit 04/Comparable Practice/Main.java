import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Employee implements Comparable<Employee> {
    int eid;
    String name;
    int sal;

    Employee(int eid, String name, int sal) {
        this.eid = eid;
        this.name = name;
        this.sal = sal;
    }

    // public int compareTo(Employee E) {
    // if (sal == E.sal)
    // return 0;
    // else if (sal > E.sal)
    // return 1;
    // else
    // return -1;
    // }

    public int compareTo(Employee E) {
        return this.sal - E.sal;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(6, "Arvind", 50000));
        list.add(new Employee(12, "Yuvaan", 20000));
        list.add(new Employee(1, "Jiya", 30000));
        Collections.sort(list);
        for (Employee e : list) {
            System.out.println(e.eid + " " + e.name + " " + e.sal);
        }
    }
}