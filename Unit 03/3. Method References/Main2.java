@FunctionalInterface
interface Operation {
    int add(int a, int b);
}

class Sample {
    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        return a / b;
    }

    static int mul(int a, int b) {
        return a * b;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Operation obj1 = Sample::mul;
        int r1 = obj1.add(10, 2);
        System.out.println("The result is: " + r1);
    };

}
