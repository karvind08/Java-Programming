public class YieldExample implements Runnable {
    public void run() {
        System.out.println("Started " + Thread.currentThread());
        Thread.yield();
        System.out.println("Ended " + Thread.currentThread());
    }

    public static void main(String[] args) {
        YieldExample y1 = new YieldExample();
        Thread T1 = new Thread(y1, "First Child Thread");
        YieldExample y2 = new YieldExample();
        Thread T2 = new Thread(y2, "Second Child Thread");
        T1.start();
        T2.start();
    }

}
