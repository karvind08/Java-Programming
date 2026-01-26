class A {
    int a;
    private int b;

    void showab() {
        System.out.println("a and b: " + a + " " + b);
    }

    public static void main(String[] args) {
        Inheritance1 I1 = new Inheritance1();
        I1.a = 10;
        I1.b = 20;
        I1.showab();
    }
}
