package notification;

public class EmailNotificationImpl implements Notification {

    private String mobileNumber;


    public EmailNotificationImpl(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void sendOverdue() {
        System.out.println("Sending overdue notice to - " + mobileNumber);
    }
}
