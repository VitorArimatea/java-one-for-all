package academy.arimatea.javaoneforall.javacore.Oexception.exception.domain;

public class InvalidLoginException extends Exception {

    public InvalidLoginException() {
        super("Invalid Login");
    }

    public InvalidLoginException(String message) {
        super(message);
    }
}
