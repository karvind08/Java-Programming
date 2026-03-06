sealed abstract class Shape permits Circle, Rectangle, Square {
    public abstract double area();
}

final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

final class Rectangle extends Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

final class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

public class Main1 {
    public static void main(String[] args) {
        Circle C1 = new Circle(2);
        double r1 = C1.area();
        System.out.println(r1);
        Rectangle R1 = new Rectangle(10, 2);
        double r2 = R1.area();
        System.out.println(r2);
        Square S1 = new Square(2.5);
        double r3 = S1.area();
        System.out.println(r3);
    }
}
