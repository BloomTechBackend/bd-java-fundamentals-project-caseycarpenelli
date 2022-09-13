package main.com.adventure.settings;

public class InvalidCommandException extends Exception {
    /**
     * invalid command exception.
     * @param message a message to print
     */
    public InvalidCommandException(String message) {
        super(message);
    }
}


