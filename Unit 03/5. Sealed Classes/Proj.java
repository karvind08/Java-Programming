abstract sealed class Shape1 permits Circle1, Rectangle1, Square1 {
    abstract public double area();
}

final class Circle1 extends Shape1 {
    int r;

    Circle1(int r) {
        this.r = r;
    }

    public double area() {
        return 3.14 * r * r;
    }
}


public class Proj {
    public static void main(String[] args) {

    }
}
