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

    @Override
    public String toString() {
        return "Example [r=" + r + ", name=" + name + "]";
    }

}

public class Main1 {
    public static void main(String[] args) {
        Example E1 = new Example(1, "Arvind");
        Example E2 = new Example(2, "Yuvaan");
        System.out.println(E1.equals(E2));
    }

}
