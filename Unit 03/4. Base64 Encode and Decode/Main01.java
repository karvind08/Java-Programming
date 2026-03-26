import java.util.Base64;

public class Main01 {
    public static void main(String[] args) {
        String url = "www.kharwal.com";
        String encodedurl = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println(encodedurl);
    }
}
