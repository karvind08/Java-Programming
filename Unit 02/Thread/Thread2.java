class Sample implements Runnable {
    // overriding the run() method
    public void run() {
        System.out.println("Run method of the implementing class.");
    }
}

public class Thread2 {
    public static void main(String args[]) {
        Sample S = new Sample();
        // passing the reference to the Thread class constructor.
        Thread t = new Thread(S);
        // starting the new thread execution.
        t.start();
    }
}
