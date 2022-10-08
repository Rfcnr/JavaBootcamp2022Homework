package kodlamaioHomepage.core.logging;

public class DatabaseLogger implements ILogger{
    @Override
    public void log(String logMessage) {
        System.out.println("Logged to Database: " + logMessage);
    }
}
