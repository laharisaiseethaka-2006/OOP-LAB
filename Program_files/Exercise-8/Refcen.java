import java.util.ArrayList;
class Book {
    private String title;
    private String author;
    private boolean isCheckedOut;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
    public void checkOut() {
        if (!isCheckedOut) {
            isCheckedOut = true;
            System.out.println("The book '" + title + "' has been checked out.");
        } else {
            System.out.println("Sorry, the book '" + title + "' is already checked out.");
        }
    }
    public void returnBook() {
        if (isCheckedOut) {
            isCheckedOut = false;
            System.out.println("The book '" + title + "' has been returned.");
        } else {
            System.out.println("This book was not checked out.");
        }
    }
}
class Library {
    private ArrayList<Book> books;
    public Library() {
        books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        System.out.println("The book '" + book.getTitle() + "' by " + book.getAuthor() + " has been added to the library.");
    }
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor() + (book.isCheckedOut() ? " (Checked Out)" : " (Available)"));
            }
        }
    }
}

public class Refcen {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        library.addBook(book1);
        library.addBook(book2);
        library.listBooks();
        book1.checkOut();
        book1.checkOut();
        book1.returnBook();
        library.listBooks();
    }
}
