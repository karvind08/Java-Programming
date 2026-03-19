public class YieldExample1 implements Runnable {
    public void run() {
        System.out.println("Started " + Thread.currentThread());
        Thread.yield();
        System.out.println("Ended " + Thread.currentThread());
    }

    public static void main(String[] args) {
        YieldExample1 y1 = new YieldExample1();
        Thread T1 = new Thread(y1, "First Child");
        YieldExample1 y2 = new YieldExample1();
        Thread T2 = new Thread(y2, "Second Child");
        T1.setPriority(6);
        T2.setPriority(9);
        T1.start();
        T2.start();
    }
}
