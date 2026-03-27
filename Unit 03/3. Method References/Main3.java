interface Test2 {
    Sample2 display(String name);
}

class Sample2 {
    Sample2(String name) {
        System.out.println(name);
    }
}

public class Main3 {
    public static void main(String[] args) {
        Test2 T2 = Sample2::new;
        T2.display("Arvind");
    }
}
