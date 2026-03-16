class Example extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.print(i);
    }
}

class Sample implements Runnable {
    public void run() {
        for (char i = 'A'; i < 'F'; i++)
            System.out.print(i);
    }
}

public class Multithreading {
    public static void main(String[] args) {
        Example E1 = new Example();
        Sample S1 = new Sample();
        Thread T1 = new Thread(S1);
        E1.setPriority(1);
        T1.setPriority(10);
        E1.start();
        T1.start();

    }
}
