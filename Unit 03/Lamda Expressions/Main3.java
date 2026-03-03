interface MyName {
    public void SayMyName();
}

public class Main3 {
    public static void main(String[] args) {
        MyName person = new MyName() {
            public void SayMyName() {
                System.out.println("Arvind");
            }
        };
        person.SayMyName();
    }
}