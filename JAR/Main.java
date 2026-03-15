class Example {
    String name;
    int r;

    Example(String name, int r) {
        this.name = name;
        this.r = r;
    }

    void display() {
        System.out.println(name);
        System.out.println(r);
    }
}

public class Main {
    public static void main(String[] args) {
        Example E = new Example("Arvind", 2);
        E.display();
    }   
}
