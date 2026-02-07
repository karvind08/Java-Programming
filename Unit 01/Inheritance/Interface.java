interface Animal1 {
    void eat();
}

interface Pet {
    void play();
}

class Dog implements Animal1, Pet {
    public void eat() {
        System.out.println("The dog eats.");
    }

    public void play() {
        System.out.println("The dog plays.");
    }
}

public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.play();
    }
}
