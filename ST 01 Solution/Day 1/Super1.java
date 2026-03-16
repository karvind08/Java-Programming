class Animal1 {
    String type = "Animal";

    Animal1() {
        System.out.println("Animal Constructor called");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog1 extends Animal1 {
    String type = "Dog";

    Dog1() {
        System.out.println("Dog Constructor called");
    }

    void sound() {
        super.sound();
        System.out.println("Dog Barks");
    }

    void show() {
        System.out.println(super.type);
        System.out.println(type);
    }
}

public class Super1 {
    public static void main(String[] args) {
        Dog1 D = new Dog1();
        D.sound();
        D.show();
    }
}
