class SampleExample1<R1, R2> {
    private R1 a;
    private R2 b;

    void getdata(R1 a, R2 b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a + " " + b);
    }

}

public class Sample1 {
    public static void main(String[] args) {
        SampleExample1<Integer, String> S1 = new SampleExample1<>();
        S1.getdata(10, "Java");
        S1.display();
    }
}
