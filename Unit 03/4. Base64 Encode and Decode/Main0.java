import java.util.Base64;

public class Main0 {
    public static void main(String[] args) {
        String str = "Java Programming";
        String encodedstring = Base64.getEncoder().withoutPadding().encodeToString(str.getBytes());
        // String encodedstring = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encodedstring);
        byte[] decodedBytes = Base64.getDecoder().decode(encodedstring);
        String decodedstring = new String(decodedBytes);
        System.out.println(decodedstring);
    }

}
