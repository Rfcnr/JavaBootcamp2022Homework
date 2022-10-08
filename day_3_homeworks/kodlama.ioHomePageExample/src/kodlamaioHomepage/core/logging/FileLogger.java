package kodlamaioHomepage.core.logging;

public class FileLogger implements ILogger{
    @Override
    public void log(String logMessage) {
        System.out.println("Logged to File: " + logMessage);
    }
}
