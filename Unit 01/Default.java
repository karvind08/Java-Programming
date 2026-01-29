public class Default {
    int a;
    byte b;
    short s;
    long l;
    float f;
    double d;

    public static void main(String[] args) {
        Default D = new Default();
        System.out.println("int default: " + D.a); // 0
        System.out.println("byte default: " + D.b); // 0
        System.out.println("short default: " + D.s); // 0
        System.out.println("long default: " + D.l); // 0
        System.out.println("float default: " + D.f); // 0
        System.out.println("double default: " + D.d); // 0
    }
}