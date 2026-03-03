interface Example {
    void display(String m);
}

public class Main implements Example {
    @Override
    public void display(String m) {
        System.out.println("Hello " + m);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.display("Arvind");
    }
}