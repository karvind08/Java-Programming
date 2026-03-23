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
        Thread T1 = new Thread(C1);
        Thread T2 = new Thread(C2);
        T1.start();
        T2.start();
    }
}
