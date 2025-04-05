import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("output.txt", true);
            writer.write("\nThis line is appended to the file.");
            writer.close();  
            System.out.println("Data has been appended to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file handling: " + e.getMessage());
        }
    }
}
