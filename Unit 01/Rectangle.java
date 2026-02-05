public class Rectangle {
    int width, length;

    void getdata(int x, int y) {
        this.width = x;
        this.length = y;
    }

    int area() {
        int a = width * length;
        return (a);
    }
}
