class Example extends Thread {
    // overriding the run() method
    public void run() {
        System.out.println("Run method of the Example class.");
    }
}

public class Thread1 {
    public static void main(String args[]) {
        Example E1 = new Example();
        // starting the new thread execution.
        E1.start();
    }
}
