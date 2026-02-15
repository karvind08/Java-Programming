public class Anonymous2 {
    public static void main(String[] args) {
        int sum = 0;
        for (int num : new int[] { 5, 15, 25, 35 }) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
