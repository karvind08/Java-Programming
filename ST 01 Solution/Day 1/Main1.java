class NumberRunner1 implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 (Number): " + i);
        }
    }
}

class AlphaThread1 extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Thread 2 (Alpha): " + c);
        }
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Creating threads
        AlphaThread1 t2 = new AlphaThread1();
        NumberRunner1 N = new NumberRunner1();
        Thread t1 = new Thread(N);
        // Setting priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.MAX_PRIORITY); // 10

        // Starting threads
        t1.start();
        t2.start();

        try {
            // Synchronizing execution (Main waits for t1 and t2 to finish)
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Both threads finished execution.");
    }
}
