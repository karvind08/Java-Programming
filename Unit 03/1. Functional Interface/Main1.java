import java.util.*;

interface PersonalGreet {
    String greeting(String name);
}

public class Main1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("May I please know your Name?");
        String name = S.next();
        PersonalGreet hello = (String temp) -> "Hello! " + temp;
        System.out.println(hello.greeting(name));
        S.close();
    }
}