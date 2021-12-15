package main.com.adventure.settings;

public class EmptyCommandException  extends Exception {
    /**
     * empty command exception.
     * @param message a message to print
     */
    public EmptyCommandException(String message) {
        super(message);
    }
}

