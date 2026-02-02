class NumberX {
    int x;

    void getX(int a) {
        x = a;
    }
}

class NumberY {
    int y;

    void getY(int b) {
        y = b;
    }
}

public class Relational2 {
    public static void main(String[] args) {
        NumberX NX = new NumberX();
        NumberY NY = new NumberY();
        NX.getX(10);
        NY.getY(20);
        if (NX.x < NY.y) {
            System.out.println("Y is greater than X");
        } else {
            System.out.println("X is greater than Y");
        }
    }
}
