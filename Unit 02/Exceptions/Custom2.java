class MyException extends Exception {
    private int a;

    MyException(int a) {
        this.a = a;
    }

    public String toString() {
        return "MyException[" + a + "]";
    }
}

public class Custom2 {
    static void display(int a) throws MyException {
        System.out.println("Called(" + a + ")");
        if (a > 10)
            throw new MyException(a);
        System.out.println("Normal Exit");
    }

    public static void main(String[] args) {
        try {
            display(5);
            display(20);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
