class Example {
    public int display(int x, int y) {
        int res = x + y;
        return res;
    }

    public int display(int x, int y, int z) {
        int r = x + y + z;
        return r;
    }
}

class Overloading1 {
    public static void main(String[] args) {
        Example E = new Example();
        int r1 = E.display(10, 20);
        int r2 = E.display(10, 20, 30);
        System.out.println("The sum is: " + r1);
        System.out.println("The sum is: " + r2);
    }
}