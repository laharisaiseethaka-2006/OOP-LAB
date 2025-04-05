import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            // Create a new file
            File file = new File("output.txt");

            // Check if the file already exists
            if (!file.exists()) {
                file.createNewFile();  // Create the file if it doesn't exist
            }

            // Create FileWriter object to write data to the file
            FileWriter writer = new FileWriter(file);
            writer.write("This is a test message written to the file.\n");
            writer.write("File handling in Java is easy to implement.");
            writer.close();  // Close the writer

            System.out.println("Data has been written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file handling: " + e.getMessage());
        }
    }
}
