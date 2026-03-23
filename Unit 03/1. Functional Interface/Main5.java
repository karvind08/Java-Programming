interface Example {
    void display();
}

public class Main5 {
    public static void main(String[] args) {
        Example E1 = () -> {
            System.out.println("Display Method");
        };
        E1.display();
    }

}
