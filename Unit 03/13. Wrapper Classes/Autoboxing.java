public class Autoboxing {
    public static void main(String[] args) {
        int i = 100;
        Integer I1 = Integer.valueOf(i);
        I1 = i;
        System.out.println(I1);
        System.out.println("=========");
        Integer I2 = Integer.valueOf(20);
        System.out.println(I2);
        Integer I3 = 30;
        System.out.println(I3);
    }
}
