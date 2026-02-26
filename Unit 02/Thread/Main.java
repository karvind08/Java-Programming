class Example1 extends Thread {
    public void run() {
        System.out.println("This is thread");
    }
}

public class Main {
    public static void main(String[] args) {
        Example1 E = new Example1();
        E.start();
    }

}
