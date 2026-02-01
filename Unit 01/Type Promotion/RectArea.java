class Rectangle {
    int width;
    int length;

    void getdata(int x, int y) {
        length = x;
        width = y;
    }

    int rectarea() {
        int a = length * width;
        return (a);
    }
}

public class RectArea {
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.getdata(10, 20);
        int res = R.rectarea();
        System.out.println("The area is " + res);

    }
}
