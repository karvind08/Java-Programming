class AA {
    void display() {
        System.out.println("Instance method display in AA class");
    }

    static void show() {
        System.out.println("Class Method show in AA class");
    }
}

class BB extends AA {
    void display() {
        System.out.println("Instance Method display in BB Class");
    }

    static void show() {
        System.out.println("Class Method show in BB class");
    }
}

public class Main1 {
    public static void main(String[] args) {
        BB B1 = new BB();
        B1.display();
        BB.show();
        AA.show();
    }

}
