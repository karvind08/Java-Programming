class Example {
    public double display(int x, double y) {
        double res = x + y;
        return res;
    }

    public double display(int x, int y, double z) {
        double r = x + y + z;
        return r;
    }
}

class Overloading2 {
    public static void main(String[] args) {
        Example E = new Example();
        double r1 = E.display(10, 20.5);
        double r2 = E.display(10, 20, 30.6);
        System.out.println("The sum is: " + r1);
        System.out.println("The sum is: " + r2);
    }
}