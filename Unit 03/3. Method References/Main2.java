@FunctionalInterface
interface Operation {
    int add(int a, int b);
}

public class Main2 {
    public static void main(String[] args) {
        Operation O = (int a, int b) -> {
            return a + b;
        };
        int r = O.add(10, 20);
        System.out.println(r);
    }
}
