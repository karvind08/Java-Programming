interface MyInterface {
    Sample display(String message);
}

class Sample {
    public Sample(String message) {
        System.out.print(message);
    }
}

public class Example4 {
    public static void main(String[] args) {
        MyInterface ref = Sample::new;
        ref.display("Hello World!");
    }
}