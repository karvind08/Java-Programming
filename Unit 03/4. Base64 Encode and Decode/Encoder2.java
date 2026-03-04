import java.util.Base64;

public class Encoder2 {
    public static void main(String args[]) {
        String str = "Arvind Kharwal";
        String encodedString = Base64.getEncoder().withoutPadding().encodeToString(str.getBytes());
        System.out.println("Encoded String(Without padding) of " + str + " is " + encodedString);
    }

}
