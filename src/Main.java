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
        LendBook lendBook =new LendBookImpl(new EmailNotificationImpl("email@mail.com") , new PrintBookInfo(book));
        lendBook.lendBook(new User("123", "Amit Karma"));
    }

    /* Output
    * Lending book to user User{userId='123', name='Amit Karma'}
    * Print Book info : Book{title='ABC', author=auther.Auther{name='Karma'}, isbn='1245545'}
    * Sending overdue notice to - email@mail.com
    */
}