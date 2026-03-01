import java.util.*;

interface PersonalGreet {
    String greeting(String name);
}

public class Main2 implements PersonalGreet {

    public String greeting(String name) {
        return "Hello! " + name;
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("May I please know your Name?");
        String name = S.next();
        Main2 obj = new Main2();
        String Res = obj.greeting(name);
        System.out.println(Res);
        S.close();
    }

}
