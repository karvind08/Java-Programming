class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

class Dog extends Animal {
    int age;

    Dog(String name, int age) {
        super(name);
        this.name = name;
        this.age = age;
    }

    void show() {
        System.out.println("The name and age is: " + name + " " + age);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Animal A = new Animal("Jhony");
        A.display();
        Dog D = new Dog("Doggy", 2);
        D.display();
        D.show();
    }
}
