public class Rectangle1 {
    int l,w;
    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.getdata(10, 20);
        int res = R.rectarea();
        System.out.println("The area is " + res);

    }
}
