package printer;

import book.Book;

public class PrintBookInfo implements Printer{

    private Book book;

    public PrintBookInfo(Book book) {
        this.book = book;
    }


    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public void printBookInfo() {
        System.out.println("Print Book info : " +this.book);
    }
}
