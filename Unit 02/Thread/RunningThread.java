class ChildClass1 extends Thread {
    public void run() {
        System.out.println("Run method of the first class.");
    }
}

class ChildClass2 extends Thread {
    public void run() {
        System.out.println("Run method of the second class.");
    }
}

class ChildClass3 extends Thread {
    public void run() {
        System.out.println("Run method of the third class.");
    }
}

public class RunningThread {
    public static void main(String args[]) {
        ChildClass1 CC1 = new ChildClass1();
        ChildClass2 CC2 = new ChildClass2();
        ChildClass3 CC3 = new ChildClass3();

        // starting the new thread execution.
        CC1.start();
        CC2.start();
        CC3.start();
    }
}
