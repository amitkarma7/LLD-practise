package library.management.system.book;
import library.management.system.auther.Author;


public class Book {
    private String title;
    private Author author;
    private String isbn;

    public Book(String title, Author author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
