interface MyName1 {
    public void SayMyName();
}

public class Main4 {
    public static void main(String[] args) {
        MyName1 M = () -> {
            System.out.println("Arvind");
        };
        M.SayMyName();
    };
}