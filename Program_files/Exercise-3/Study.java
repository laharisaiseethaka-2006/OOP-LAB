class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public void display() {
        System.out.println("Book Title: " + title);
    }
}


class EBook extends Book {
    public EBook(String title) {
        super(title);
    }

       public void display() {
        System.out.println("E-Book Title: " + title);
    }
}

public class Study {
    public static void main(String[] args) {
        EBook ebook = new EBook("Java Programming");
        ebook.display();  
    }
}