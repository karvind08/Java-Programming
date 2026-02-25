class PriorityThread extends Thread {
    private String threadName;

    PriorityThread(String name) {
        this.threadName = name;
    }

    public void run() {
        System.out.println(threadName + " is running with priority: " + getPriority());
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("Thread-1");
        PriorityThread t2 = new PriorityThread("Thread-2");
        PriorityThread t3 = new PriorityThread("Thread-3");
        // Set custom priorities
        t1.setPriority(Thread.MIN_PRIORITY); // 1
        t2.setPriority(Thread.NORM_PRIORITY); // 5
        t3.setPriority(Thread.MAX_PRIORITY); // 10
        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}