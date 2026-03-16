import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.Files;
import java.io.IOException;

public class CopyImage {
    public static void main(String[] args) {
        Path SP = Paths.get("mug.jpg");
        Path DP = Paths.get("mug_copy.jpg");
        try {
            Files.copy(SP, DP, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
