abstract class FileHandler {
    abstract void openFile(String fileName);
}
interface FileOperations {
    void readFile();
    void closeFile();
}
class TextFileHandler extends FileHandler implements FileOperations {
    private String fileName;
    void openFile(String fileName) {
        this.fileName = fileName;
        System.out.println("Opening file: " + fileName);
    }
    public void readFile() {
        System.out.println("Reading content from file: " + fileName);
    }
    public void closeFile() {
        System.out.println("Closing file: " + fileName);
    }
}

public class Files {
    public static void main(String[] args) {
        TextFileHandler fileHandler = new TextFileHandler();
        fileHandler.openFile("data.txt");
        fileHandler.readFile();
        fileHandler.closeFile();
    }
}