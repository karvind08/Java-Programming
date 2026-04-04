class Test<T> {
    T display(T a) {
        return a;
    }
}

public class Anonymous {
    public static void main(String[] args) {
        Test<Integer> T1 = new Test<>();
        int r = T1.display(10);
        Integer res = T1.display(10);
        System.out.println(r);
        System.out.println(res);
    }
}
