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

final class Rectangle1 extends Shape1 {
    int l, b;

    Rectangle1(int l, int b) {
        this.l = l;
        this.b = b;
    }

    public double area() {
        return l * b;
    }
}

final class Square1 extends Shape1 {
    int n;

    Square1(int n) {
        this.n = n;
    }

    public double area() {
        return n * n;
    }
}

public class Proj {
    public static void main(String[] args) {
        Circle1 C1 = new Circle1(2);
        double r1 = C1.area();
        System.out.println(r1);
        Rectangle1 R1 = new Rectangle1(2, 3);
        double r2 = R1.area();
        System.out.println(r2);
        Square1 S1 = new Square1(5);
        double r3 = S1.area();
        System.out.println(r3);
    }
}
