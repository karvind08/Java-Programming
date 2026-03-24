import java.util.Base64;

public class Main4 {
    public static void main(String[] args) {
        String str = "Arvind Kharwal";
        String encodedstring = Base64.getEncoder().withoutPadding().encodeToString(str.getBytes());
        System.out.println(encodedstring);
    }
}
