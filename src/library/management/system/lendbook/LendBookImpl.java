package library.management.system.lendbook;


import library.management.system.notification.Notification;
import library.management.system.printer.Printer;
import library.management.system.user.UserMember;

public class LendBookImpl implements LendBook {

    private Notification notification;
    private Printer print;

    public LendBookImpl(Notification notification, Printer print) {
        this.notification = notification;
        this.print = print;
    }

    @Override
    public void lendBookFun(UserMember userMember) {
        System.out.println("Lending library.management.system.book to library.management.system.userMember " + userMember);
        print.printBookInfo();
        notification.sendOverdue();
    }
}
