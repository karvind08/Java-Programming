import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        String str = "Arvind Kharwal";
        String encodedstring = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encodedstring);
    }
}
