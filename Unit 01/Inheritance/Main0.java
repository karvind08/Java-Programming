class Parent {
    void display() {
        System.out.println("I am in Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("I am in Child Class");
    }
}

public class Main0 {
    public static void main(String[] args) {
        Child C1 = new Child();
        C1.show();
        C1.display();
        Parent P = new Parent();
        P.display();
    }
}
