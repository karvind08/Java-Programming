class Example1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.print(i);
    }
}

class Example2 implements Runnable {
    public void run() {
        for (char i = 'A'; i <= 'E'; i++)
            System.out.print(i);
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        Example1 E1 = new Example1();
        Example2 E2 = new Example2();
        Thread T1 = new Thread(E2, "Second Thread");
        E1.start();
        T1.start();
    }
}
