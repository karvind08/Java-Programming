
// import java.lang.annotation.Repeatable;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Schedules.class)
@Retention(RetentionPolicy.RUNTIME)
@interface Schedule {
    String month() default "January";

    String day() default "Monday";

    int hour() default 12;
}

@Retention(RetentionPolicy.RUNTIME)
@interface Schedules {
    Schedule[] value();
}

@Schedule(month = "March", day = "Thursday", hour = 10)

public class Main1 {
    public static void main(String[] args) {
        Schedule[] S = Main1.class.getAnnotationsByType(Schedule.class);
        for (Schedule i : S) {
            System.out.println(i.month());
            System.out.println(i.day());
            System.out.println(i.hour());
        }
    }
}
