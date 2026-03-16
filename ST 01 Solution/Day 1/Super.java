class Animal {
    String type = "Animal";

    Animal() {
        System.out.println("Animal Constructor called");
    }

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    String type = "Dog";

    Dog() {
        System.out.println("Dog Constructor called");
    }

    void sound() {
        System.out.println("Dog Barks");
    }

    void show() {
        System.out.println(type);
    }
}

public class Super {
    public static void main(String[] args) {
        Dog D = new Dog();
        D.sound();
        D.show();
    }
}
