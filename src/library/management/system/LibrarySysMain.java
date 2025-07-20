package library.management.system;

import library.management.system.auther.Author;
import library.management.system.book.Book;
import library.management.system.lendbook.LendBook;
import library.management.system.lendbook.LendBookImpl;
import library.management.system.notification.EmailNotificationImpl;
import library.management.system.printer.PrintBookInfo;
import library.management.system.user.UserMember;

public class LibrarySysMain {

    public static void main(String[] args) {
        Author author = new Author("Karma");
        Book book =new Book("ABC" , author , "1245545");
        LendBook lendBook =new LendBookImpl(new EmailNotificationImpl("email@mail.com") , new PrintBookInfo(book));
        UserMember userMember = new UserMember("123", "Amit Karma");
        lendBook.lendBookFun(userMember);
    }
}
