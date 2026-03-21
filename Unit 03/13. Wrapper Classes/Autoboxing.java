public class Autoboxing {
    public static void main(String[] args) {
        int i = 100;
        Integer I1 = Integer.valueOf(i);
        I1 = i;
        System.out.println(I1);
    }
}
