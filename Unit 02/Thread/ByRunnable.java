class IC1 implements Runnable {
    public void run() {
        System.out.println("Run method of the first implementing class.");
    }
}

class IC2 implements Runnable {
    public void run() {
        System.out.println("Run method of the second implementing class.");
    }
}

public class ByRunnable {
    public static void main(String args[]) {
        IC1 I1 = new IC1();
        IC2 I2 = new IC2();
        Thread t1 = new Thread(I1);
        Thread t2 = new Thread(I2);
        // starting the new thread execution.
        t2.start();
        t1.start();
    }
}
