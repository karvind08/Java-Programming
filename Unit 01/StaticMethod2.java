class Example {
    String name;
    static int count = 0;

    void getdata(String name) {
        this.name = name;
        count++;
    }

    static void show() {
        System.out.println(count);
        // System.out.println(name);
    }

    void showname() {
        System.out.println(name);
    }
}

public class StaticMethod2 {
    public static void main(String[] args) {
        Example E = new Example();
        E.getdata("Arvind");
        E.showname();
        Example.show();
    }
}
