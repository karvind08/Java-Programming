public class Main {
    public static void printf(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        String[] names = { "A", "B", "C" };
        for(String n:names)
            printf(n);
    }
}
