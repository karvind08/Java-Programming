import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Employee1 implements Comparable<Employee1> {
    int eid;
    String name;
    double sal;

    Employee1(int eid, String name, double sal) {
        this.eid = eid;
        this.name = name;
        this.sal = sal;
    }

    public int compareTo(Employee1 E) {
        if (eid == E.eid)
            return 0;
        else if (eid > E.eid)
            return 1;
        else
            return -1;
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();
        list.add(new Employee1(6, "Arvind", 50000));
        list.add(new Employee1(12, "Yuvaan", 20000));
        list.add(new Employee1(1, "Jiya`", 30000));
        Collections.sort(list);
        for (Employee1 e : list) {
            System.out.println(e.eid + " " + e.name + " " + e.sal);
        }
    }
}
