interface Example1 {
    void display(String m);
}

public class Main1 {
    public static void main(String[] args) {
        Example E = (m) -> {
            System.out.println("Hello " + m);
        };
        E.display("Arvind");
    }
}