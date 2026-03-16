import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class ImageFileCopier {

    public static void main(String[] args) {
        // Define the source and destination file paths
        Path sourcePath = Paths.get("img1.png"); // Replace with your source image path
        Path destinationPath = Paths.get("copied_image.png"); // Replace with your desired destination path

        try {
            // Copy the file from source to destination
            // StandardCopyOption.REPLACE_EXISTING ensures that if the destination file
            // already exists, it will be replaced
            Files.copy(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Image file copied successfully from " + sourcePath + " to " + destinationPath);

        } catch (IOException e) {
            // Handle exceptions such as file not found, permission issues, etc.
            System.err.println("Error copying file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
