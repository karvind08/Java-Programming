interface Example2 {
    int add(int a, int b);
}

public class Main7 {
    public static void main(String[] args) {
        Example2 E2 = (int a, int b) -> a + b;
        int res = E2.add(10, 20);
        System.out.println("Addition: " + res);
    }
}