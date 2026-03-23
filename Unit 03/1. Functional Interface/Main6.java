interface Example1 {
    int display(int a);
}

public class Main6 {
    public static void main(String[] args) {
        Example1 E1 = (int r) -> r + 50;
        int res = E1.display(10);
        System.out.println(res);
    }
}
