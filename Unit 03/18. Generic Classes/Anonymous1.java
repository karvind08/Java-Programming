abstract class Test1<T> {
    abstract T display(T a);
}

public class Anonymous1 {
    public static void main(String[] args) {
        Test<Integer> T1 = new Test<>() {
            Integer display(Integer A) {
                return A;
            }
        };
        Integer I1 = T1.display(100);
        System.out.println(I1);
    }
}
