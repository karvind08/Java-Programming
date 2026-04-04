public class Example<T> {
    private T a;

    public void getdata(T a) {
        this.a = a;
    }

    T display() {
        return a;
    }

    public static void main(String[] args) {
        Example<String> E1 = new Example<>();
        E1.getdata("Arvind");
        System.out.println(E1.display());
        Example<Integer> E2 = new Example<>();
        E2.getdata(10);
        System.out.println(E2.display());
    }

}
