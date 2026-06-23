
interface MessageSender {
    void sendMessage(String message);
}

class EmailSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}


class SmsSender implements MessageSender {

    @Override
    public void sendMessage(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationService {

    private MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void send(String message) {
        messageSender.sendMessage(message);
    }
}


public class Main4 {

    public static void main(String[] args) {

        // Using Email sender
        MessageSender emailSender = new EmailSender();
        NotificationService emailService = new NotificationService(emailSender);
        emailService.send("Hello via Email");

        System.out.println("-----");

        // Using SMS sender
        MessageSender smsSender = new SmsSender();
        NotificationService smsService = new NotificationService(smsSender);
        smsService.send("Hello via SMS");
    }
}
