class Addition {
    int a, b;

    Addition() {
        System.out.println("Default Constructor");
    }

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

public class Main5 {
    public static void main(String[] args) {
        Addition A1 = new Addition(10, 20);
        Addition A2 = new Addition(100, 200);
        Addition obj1 = new Addition();
        int res = obj1.displaysum(A1, A2);
        System.out.println("The result is: " + res);

    }
}
