public class Main3 implements Runnable {
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        Runnable R = new Main3();
        Thread T1 = new Thread(R, "Thread 1");
        T1.start();
        String S = T1.getName();
        System.out.println(S);
    }
}
