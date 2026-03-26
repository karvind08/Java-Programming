import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(Schedules.class)
@interface Schedule {
    String month() default "January";

    String day() default "Monday";

    int hour() default 12;
}

@Retention(RetentionPolicy.RUNTIME)

@interface Schedules {
    Schedules[] value();
}

// public class Main1 {

// }
