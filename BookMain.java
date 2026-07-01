package lab07;

import java.util.ArrayList;

class Book {
    int bookId;
    String bookName;
    String authorName;

    // Parameterized Constructor
    Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Display Method
    void display() {
        System.out.println("Book [bookId=" + bookId + ", bookName=" + bookName
                + ", authorName=" + authorName + "]");
    }
}

public class BookMain {
    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();

        books.add(new Book(101, "Let Us C", "Yashavant P. Kanetkar"));
        books.add(new Book(102, "Head First Java", "Kathy Sierra"));

        System.out.println("--All Books--");

        // Enhanced for loop
        for (Book b : books) {
            b.display();
        }
    }
}