class Example {
    private int r;
    private String name;

    public Example(int r, String name) {
        this.r = r;
        this.name = name;
    }

    // Getters
    public int getR() {
        return r;
    }

    public String getName() {
        return name;
    }

}

public class Main {
    public static void main(String[] args) {
        Example E = new Example(1, "Arvind");
        System.out.println(E.getR());
        System.out.println(E.getName());

    }

}
