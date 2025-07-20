package library.management.system.notification;

public class SmsNotificationImple implements Notification{

    private String userEmail;

    public SmsNotificationImple(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public void sendOverdue() {
        System.out.println("Sending overdue notice to " + userEmail);
    }
}
