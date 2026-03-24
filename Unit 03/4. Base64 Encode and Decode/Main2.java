import java.util.Base64;

public class Main2 {
    public static void main(String[] args) {
        String str = "https://www.kharwal.com";
        String encodedurl = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encodedurl);
    }
}
