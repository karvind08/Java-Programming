interface MyInter1 {
    int add(int a, int b);
}

public class Main8 {
    public static void main(String[] args) {
        MyInter1 M1 = (a, b) -> (a + b);
        System.out.println(M1.add(100, 20));
        MyInter1 M2 = (int a, int b) -> {
            return (a + b);
        };

        System.out.println(M2.add(100, 200));
    }
}