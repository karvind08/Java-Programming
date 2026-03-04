interface MyInter2 {
    public String greet(String s);

}

public class Main11 {
    public static void main(String[] args) {
        String s1 = "Hello";
        MyInter2 M1 = (str) -> {
            return s1 + ", " + str;
        };

        System.out.println(M1.greet("Arvind"));
    }
}