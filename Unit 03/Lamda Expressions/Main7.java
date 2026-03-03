interface MyInter {
    int add(int a, int b);
}

public class Main7 {
    public static void main(String[] args) {
        // Multiple parameters in lambda expression
        MyInter ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(100, 200));
        // Multiple parameters with data type in the lambda expression
        MyInter ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(200, 300));
    }
}