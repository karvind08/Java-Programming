import java.util.*;

class Employee1 {
    int eid;
    String name;
    int sal;

    Employee1(int eid, String name, int sal) {
        this.eid = eid;
        this.name = name;
        this.sal = sal;
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Employee1> list = new ArrayList<>();
        list.add(new Employee1(6, "Arvind", 50000));
        list.add(new Employee1(12, "Yuvaan", 20000));
        list.add(new Employee1(1, "Jiya", 30000));
        Collections.sort(list, (S1, S2) -> Integer.compare(S1.eid, S2.eid));
        for (Employee1 e : list) {
            System.out.println(e.eid + " " + e.name + " " + e.sal);
        }
    }
}