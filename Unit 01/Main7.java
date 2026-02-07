class Addition {
    int a, b;

    Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int displaysum(Addition A, Addition B) {
        this.a = A.a + B.a;
        this.b = A.b + B.b;
        int s = a + b;
        return (s);
    }
}

public class Main7 {
    public static void main(String[] args) {
        Addition A1 = new Addition(10, 20);
        Addition A2 = new Addition(100, 200);

        // System.out.println("The result is: " + res);

    }
}
