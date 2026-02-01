public class Rectangle1 {
    int l;
    int w;

    public static void main(String[] args) {
        Rectangle1 R = new Rectangle1();
        R.l = 5;
        R.w = 4;
        int res = R.l * R.w;
        System.out.println("The area is " + res);
    }
}
