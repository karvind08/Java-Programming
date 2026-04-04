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
    }

}
