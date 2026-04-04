class Test<T> {
    T display(T a) {
        return a;
    }
}

public class Anonymous {
    public static void main(String[] args) {
        Test<Integer> T1 = new Test<>();
        int res = T1.display(10);
        System.out.println(res);
    }
}
