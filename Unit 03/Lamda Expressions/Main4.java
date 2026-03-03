interface MyName {
    public void SayMyName();
}

public class Main4 {
    public static void main(String[] args) {
        MyName M = () -> {
            System.out.println("Arvind");
        };
        M.SayMyName();
    };
}