public class Anonymous {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + " : " + arr[i]);
        }
    }

    public static void main(String[] args) {
        printArray(new int[] { 10, 20, 30, 40, 50 });
        int sum = 0;
        for (int num : new int[] { 5, 15, 25, 35 }) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);
    }
}
