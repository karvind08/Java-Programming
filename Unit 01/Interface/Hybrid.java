class GrandParent {
    void gdisplay() {
        System.out.println("Grand Parent");
    }
}

interface Parent1 {
    void p1display();
}

interface Parent2 {
    void p2display();
}

class Child extends GrandParent implements Parent1, Parent2 {
    public void p1display() {
        System.out.println("Parent 1 Display");
    }

    public void p2display() {
        System.out.println("Parent 2 Display");
    }

    public void play() {
        System.out.println("I am player");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Child C1 = new Child();
        C1.play();
        C1.p1display();
        C1.p2display();
        C1.gdisplay();
    }

}
