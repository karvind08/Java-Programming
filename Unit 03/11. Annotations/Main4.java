import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Employees.class) // container annotation
@interface Employee1 {
    String name();

    int salary();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Employees {
    Employee1[] value();
}

@Employee1(name = "Arvind", salary = 1000)
@Employee1(name = "Yuvaan", salary = 5000)
public class Main4 {
    public static void main(String[] args) {
        Employee1[] E1 = Main4.class.getAnnotationsByType(Employee1.class);
        for (Employee1 e : E1) {
            System.out.println(e.name());
            System.out.println(e.salary());
        }

    }
}
