import java.util.Base64;

public class Main1 {
    public static void main(String[] args) {
        String str = "Arvind Kharwal";
        String encodedstring = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println(encodedstring);
        byte[] decodedbytes = Base64.getDecoder().decode(encodedstring);
        String decodedstring = new String(decodedbytes);
        System.out.println(decodedstring);
    }
}
