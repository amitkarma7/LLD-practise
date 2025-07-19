import auther.Author;
import book.Book;
import lendbook.LendBook;
import lendbook.LendBookImpl;
import notification.EmailNotificationImpl;
import notification.Notification;
import printer.PrintBookInfo;
import printer.Printer;
import user.User;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Author author = new Author("Karma");
        Book book =new Book("ABC" , author , "1245545");
        LendBook lendBook =new LendBookImpl(new EmailNotificationImpl("1233") , new PrintBookInfo(book));
        lendBook.lendBook(new User("123", "Amit Karma"));
    }
}