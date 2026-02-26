public class Main2 {
    public static void main(String[] args) {
        Thread T1 = new Thread("Thread 1");
        Thread T2 = new Thread("Thread 2");
        T1.start();
        T2.start();
        String S1 = T1.getName();
        String S2 = T2.getName();
        System.out.println(S1);
        System.out.println(S2);
    }
}
