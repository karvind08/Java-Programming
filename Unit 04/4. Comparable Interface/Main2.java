import java.util.ArrayList;
import java.util.List;
import java.util.*;

class Employee2 implements Comparable<Employee2> {
    int eid;
    String name;
    double sal;

    Employee2(int eid, String name, double sal) {
        this.eid = eid;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public int compareTo(Employee2 E) {
        // Compare names lexicographically
        return this.name.compareTo(E.name);
    }
}

public class Main2 {
    public static void main(String[] args) {
        List<Employee2> list = new ArrayList<>();
        list.add(new Employee2(6, "Arvind", 50000));
        list.add(new Employee2(12, "Yuvaan", 20000));
        list.add(new Employee2(1, "Jiya", 30000));

        Collections.sort(list); // sorts by name

        for (Employee2 e : list) {
            System.out.println(e.eid + " " + e.name + " " + e.sal);
        }
    }
}
