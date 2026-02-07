class Grand {
    void grandmethod() {
        System.out.println("I am in Grand class");
    }
}

class Parent1 extends Grand {
    void parent1method() {
        System.out.println("I am in Parent1 Class");
    }
}

class Child1 extends Parent1 {
    void child1method() {
        System.out.println("I am in Child class");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Child1 C1 = new Child1();
        C1.child1method();
        C1.parent1method();
        C1.grandmethod();
    }

}
