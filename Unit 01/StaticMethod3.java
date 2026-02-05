class Hello {
    static void staticmathod1() {
        System.out.println("I am in staticmethod1");
    }

    static void staticmathod2() {
        staticmathod1();
        System.out.println("I am in staticmethod2");
    }

    void nonstaticmethod() {
        staticmathod1();
        System.out.println("I am in non static method");
    }
}

public class StaticMethod3 {
    public static void main(String[] args) {
        Hello.staticmathod1();
        Hello.staticmathod2();
        Hello H = new Hello();
        H.nonstaticmethod();
    }
}
