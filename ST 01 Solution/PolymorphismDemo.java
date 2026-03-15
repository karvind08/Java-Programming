class Shape {
    public double area() {
        System.out.println("Area of shape is undefined.");
        return 0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Derived class Triangle
class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }
}

// Derived class Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}

// Main class
public class PolymorphismDemo {
    public static void main(String[] args) {
        // Runtime polymorphism: base class reference pointing to derived objects
        Shape shape = new Circle(2);
        System.out.println("Area of Circle: " + shape.area());

        Shape shape1 = new Triangle(10, 6);
        System.out.println("Area of Triangle: " + shape1.area());

        Shape shape2 = new Rectangle(8, 4);
        System.out.println("Area of Rectangle: " + shape2.area());
    }
}