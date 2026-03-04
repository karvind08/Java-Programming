import java.util.Base64;

public class URL2 {
    public static void main(String args[]) {
        String url = "https://www.kharwal.com";
        String encodedString = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println("Encoded URL is " + encodedString);

        byte[] decodedBytes = Base64.getUrlDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded URL is " + decodedString);
    }
}