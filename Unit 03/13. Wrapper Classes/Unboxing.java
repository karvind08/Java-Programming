public class Unboxing {
    public static void main(String[] args) {
        Integer I1 = 10; // Autoboxing
        System.out.println(I1);
        Integer I2 = 30;
        System.out.println(I2.intValue());
        int num = I1; // Auto-unboxing
        System.out.println(num);
        System.out.println(I2 instanceof Integer);
    }
}
