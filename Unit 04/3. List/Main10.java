class Student {
    int r;
    String name;
    double h;

    Student(int r, String name, double h) {
        this.r = r;
        this.name = name;
        this.h = h;
    }

    public int getR() {
        return r;
    }

    public String getName() {
        return name;
    }

    public double getH() {
        return h;
    }

    @Override
    public String toString() {
        return r + " " + name + " " + h + " ";
    }

}

public class Main10 {
    public static void main(String[] args) {
        
    }
}
