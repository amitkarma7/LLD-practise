package lendbook;


import notification.Notification;
import printer.Printer;
import user.User;

public class LendBookImpl implements LendBook {

    private Notification notification;
    private Printer print;

    public LendBookImpl(Notification notification, Printer print) {
        this.notification = notification;
        this.print = print;
    }

    public void lendBook(User user) {
        System.out.println("Lending book to user " + user);
        print.printBookInfo();
        notification.sendOverdue();
    }
}
