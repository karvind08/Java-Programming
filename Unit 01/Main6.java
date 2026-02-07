class ReturnObj {
    int a;

    ReturnObj(int a) {
        this.a = a;
    }

    ReturnObj increment() {
        ReturnObj R = new ReturnObj(a + 10);
        return (R);
    }
}

public class Main6 {
    public static void main(String[] args) {
        ReturnObj R1 = new ReturnObj(2);
        ReturnObj R2 = R1.increment();
        System.out.println(R1.a);
        System.out.println(R2.a);
    }

}
