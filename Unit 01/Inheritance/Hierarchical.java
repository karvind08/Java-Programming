class Animal {
    void eat() {
        System.out.println("Animal eats");
    }

}

class Dog extends Animal {
    void bark() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meow");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Cat C1 = new Cat();
        System.out.println("for Cat");
        C1.meow();
        C1.eat();
        System.out.println("for Dog");
        Dog D1 = new Dog();
        D1.bark();
        D1.eat();
    }

}
