class NumberRunner implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread 1 (Number): " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}

class AlphaThread extends Thread {
    public void run() {
        for (char c = 'A'; c <= 'E'; c++) {
            System.out.println("Thread 2 (Alpha): " + c);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating threads
        Thread t1 = new Thread(new NumberRunner());
        AlphaThread t2 = new AlphaThread();

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
