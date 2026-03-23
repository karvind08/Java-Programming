class Class1 implements Runnable {
    public void run() {
        System.out.println("Started " + Thread.currentThread());
        Thread.yield();
        System.out.println("Ended " + Thread.currentThread());
    }
}

public class Main1 {
    public static void main(String[] args) {
        Class1 C1 = new Class1();
        Class1 C2 = new Class1();
        Thread T1 = new Thread(C1, "First Thread");
        Thread T2 = new Thread(C2, "Second Thread");
        T2.setPriority(Thread.MAX_PRIORITY);
        T1.setPriority(Thread.MIN_PRIORITY);
        T2.start();
        T1.start();
        try {
            T1.join();
            T2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
