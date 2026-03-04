import java.util.Base64;

public class URL1 {
    public static void main(String args[]) {
        String url = "https://www.kharwal.com";
        String encodedString = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println("Encoded URL is " + encodedString);
    }
}