class Example1<T> {
    T a;
    T b;

    void inputdata(T a, T b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println(a + " " + b);
    }

}

public class Main {
    public static void main(String[] args) {
        Example1<String> name = new Example1<>();
        name.inputdata("Arvind", "Kharwal");
        name.display();
    }
}
