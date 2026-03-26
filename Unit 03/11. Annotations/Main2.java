import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Employee {
    String name();

    int salary();
}

@Employee(name = "Arvind", salary = 1000)
public class Main2 {
    public static void main(String[] args) {
        Employee E1 = Main2.class.getAnnotation(Employee.class);
        System.out.println(E1.name());
        System.out.println(E1.salary());
    }
}
