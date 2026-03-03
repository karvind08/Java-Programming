interface Example2 {
    void display();
}

public class Main2 {
    public static void main(String[] args) {
        Example2 E = () -> {
            System.out.println("Hello");
        };
    }

}
