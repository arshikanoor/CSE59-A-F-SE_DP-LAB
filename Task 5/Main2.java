
interface MessageSender {
    void sendMessage(String message);
}


class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email: " + message);
    }
}



class SMSSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
    }
}



class NotificationService {

    private MessageSender messageSender;

    // Dependency Injection through constructor
    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void alertUser(String msg) {
        messageSender.sendMessage(msg);
    }
}



public class Main {

    public static void main(String[] args) {

     
        MessageSender emailSender = new EmailSender();
        NotificationService emailNotification =
                new NotificationService(emailSender);

        emailNotification.alertUser("Your account has been created.");


  
        MessageSender smsSender = new SMSSender();
        NotificationService smsNotification =
                new NotificationService(smsSender);

        smsNotification.alertUser("Your OTP is 123456.");
    }
}
