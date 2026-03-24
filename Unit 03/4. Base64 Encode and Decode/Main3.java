import java.util.Base64;

public class Main3 {
    public static void main(String[] args) {
        String str = "https://www.kharwal.com";
        String encodedurl = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encodedurl);
        byte[] decodedurlbytes = Base64.getDecoder().decode(encodedurl);
        String decodedurl = new String(decodedurlbytes);
        System.out.println(decodedurl);
    }
}
