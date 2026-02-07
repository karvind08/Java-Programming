class Data1 {
    int r;
    String name;

    Data1(int r, String name) {
        this.r = r;
        this.name = name;
    }

    void display(Data1 D1) {
        this.r = D1.r;
        this.name = D1.name;
        // System.out.println(r);
        // System.out.println(name);
    }

    void show() {
        System.out.println(r);
        System.out.println(name);
    }
}

public class Main4 {
    public static void main(String[] args) {
        Data1 DO1 = new Data1(2, "Arvind");
        // DO1.show();
        Data1 DO2 = new Data1(20, "Yuvaan");
        DO2.display(DO2);
        DO2.show();
    }

}
