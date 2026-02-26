class Example2 implements Runnable {
    public void run() {
        System.out.println("Implementing runnable");
    }
}

public class Main1 {
    public static void main(String[] args) {
        Example2 E1 = new Example2();
        Example2 E2 = new Example2();
        Thread T1 = new Thread(E1);
        Thread T2 = new Thread(E2);
        T1.start();
        System.out.println("Thread 1");
        try {
            T1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        T2.start();
        System.out.println("main Thread Completes");
    }
}
