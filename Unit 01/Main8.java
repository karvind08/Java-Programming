class Test {
    int a, b;

    Test(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a + " and " + b);
    }

    int getsum(Test T1, Test T2) {
        this.a = T1.a + T2.a;
        this.b = T1.b + T2.b;
        int r = a + b;
        return (r);
    }
}

public class Main8 {
    public static void main(String[] args) {
        Test TO1 = new Test(10, 20);
        TO1.display();
        Test TO2 = new Test(100, 200);
        TO2.display();
        int r = TO1.getsum(TO1, TO2);
        System.out.println(r);

    }

}
