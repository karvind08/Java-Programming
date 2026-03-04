import java.util.Base64;

public class Decoder {
    public static void main(String args[]) {
        String str = "Arvind Kharwal";
        String encodedString = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println("Encoded String of " + str + " is " + encodedString);

        byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
        String decodedString = new String(decodedBytes);
        System.out.println("Decoded String of " + encodedString + " is " + decodedString);
    }
}