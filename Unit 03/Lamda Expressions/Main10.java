interface MyComparator {
    public boolean compare(int a1, int a2);
}

public class Main10 {
    public static void main(String[] args) {
        MyComparator M = (a1, a2) -> a1 > a2;
        boolean result = M.compare(5, 2);
        System.out.println(result);
    }
}