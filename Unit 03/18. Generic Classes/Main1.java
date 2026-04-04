class Sample<T1, T2> {
    T1 a;
    T2 b;

    void setab(T1 a, T2 b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a + " " + b);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Sample<Integer, String> S1 = new Sample<>();
        S1.setab(10, "Arvind");
        S1.display();
    }
}
