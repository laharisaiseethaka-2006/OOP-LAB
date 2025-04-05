abstract class Document {
    public abstract void read();
    public abstract void write(String content);
}
class TextFile extends Document {
    private String content;
    public void read() {
        System.out.println("Reading text content: " + content);
    }
    public void write(String content) {
        this.content = content;
        System.out.println("Writing to text file: " + content);
    }
}

class PDF extends Document {
    private String content;
    public void read() {
        System.out.println("Reading PDF content: " + content);
    }
    public void write(String content) {
        this.content = content;
        System.out.println("Writing to PDF: " + content);
    }
}

public class Doc {
    public static void main(String[] args) {
        Document textFile = new TextFile();
        Document pdfFile = new PDF();

        textFile.write("Hello, this is a text document.");
        pdfFile.write("This is a PDF document.");

        textFile.read();
        pdfFile.read();
    }
}
