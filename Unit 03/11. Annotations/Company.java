import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Roles.class)
@interface Role {
    String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Roles {
    Role[] value();
}

@Role("Admin")
@Role("Manager")
public class Company {
    public static void main(String[] args) {
        Role[] roles = Company.class.getAnnotationsByType(Role.class);
        for (Role r : roles) {
            System.out.println(r.value());
        }
    }
}