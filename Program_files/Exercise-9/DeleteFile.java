import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
            if (file.exists()) {
                if (file.delete()) {
                    System.out.println("File deleted successfully.");
                } else {
                    System.out.println("Failed to delete the file.");
                }
            } else {
                System.out.println("File does not exist.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred during file handling: " + e.getMessage());
        }
    }
}
