class Method {
    int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}

public class Main2 {
    public static void main(String[] args) {
        int myArray[] = { 45, 33, 98, 65, 76, 43, 99, 23, 68 };
        // call function by passing array in it
        Method M = new Method();
        int maxNumber = M.findMax(myArray);
        System.out.println("The max number of array is " + maxNumber);

    }
}
