import java.util.Base64;

public class Encoder {
    public static void main(String args[]) {
        String str = "Arvind Kharwal";
        String encodedString = Base64.getEncoder().encodeToString(str.getBytes());
        System.out.println("Encoded String of " + str + " is " + encodedString);
    }

}
