import java.util.*;

public class ArrayList4 {
    public static void main(String args[]) {
        ArrayList<String> str = new ArrayList<String>();
        System.out.println("Size at the beginning " + str.size());
        str.add("Hello");
        str.add("Hi");
        str.add("Namaste");
        str.add("Bonjour");
        System.out.println(str);
        System.out.println("Size after addition " + str.size());
        str.remove(0);
        System.out.println(str);
        System.out.println("Size after removal " + str.size());
    }
}