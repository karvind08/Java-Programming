class Employee {
    private int eid;
    private String name;

    Employee(int eid, String name) {
        this.eid = eid;
        this.name = name;
    }

    public int getEid() {
        return eid;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [eid=" + eid + ", name=" + name + "]";
    }

}

public class Sample {
}
