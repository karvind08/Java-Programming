class MyThread extends Thread {
    private String threadName;

    MyThread(String name) {
        this.threadName = name;
    }

    public void run() {
        System.out.println(threadName + " started.");
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(threadName + " is running step " + i);
                Thread.sleep(500); // simulate some work
            }
        } catch (InterruptedException e) {
            System.out.println(threadName + " interrupted.");
        }
        System.out.println(threadName + " finished.");
    }
}

public class JoinExample {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread-1");
        MyThread t2 = new MyThread("Thread-2");
        MyThread t3 = new MyThread("Thread-3");

        t1.start();
        try {
            // main thread waits until t1 finishes
            t1.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for t1.");
        }

        t2.start();
        try {
            // main thread waits until t2 finishes
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for t2.");
        }

        t3.start();
        try {
            // main thread waits until t3 finishes
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted while waiting for t3.");
        }

        System.out.println("All threads have finished. Main thread ends.");
    }
}