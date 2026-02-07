class Addition {
    int a, b;

    Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Addition displaysum(Addition A, Addition B) {
        Addition obj = new Addition(0, 0);
        obj.a = A.a + B.a;
        obj.b = A.b + B.b;
        return (obj);
    }
}

public class Main7 {
    public static void main(String[] args) {
        Addition A1 = new Addition(10, 20);
        Addition A2 = new Addition(100, 200);
        Addition R = A1.displaysum(A1, A2);
        System.out.println("The result is: " + R.a);
        System.out.println("The result is: " + R.b);

    }
}
