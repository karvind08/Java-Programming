class GetSet {
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

public class MainC {
    public static void main(String[] args) {
        GetSet GS = new GetSet();
        GS.setX(10);
        int r = GS.getX();
        System.out.println("The result is " + r);
    }
}