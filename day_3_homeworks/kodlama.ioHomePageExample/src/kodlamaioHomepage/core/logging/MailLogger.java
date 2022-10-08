package kodlamaioHomepage.core.logging;

public class MailLogger implements ILogger{
    @Override
    public void log(String logMessage) {
        System.out.println("Logged to Mail: " + logMessage);
    }
}
