class SampleExample<T> {
    private T a;
    private T b;

    public SampleExample(T a, T b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a + " " + b);
    }
}

public class Sample {
    public static void main(String[] args) {
        SampleExample<Integer> S = new SampleExample<>(10, 20);
        S.display();
        SampleExample<String> S1 = new SampleExample<>("Hello", "Java");
        S1.display();
    }
}
