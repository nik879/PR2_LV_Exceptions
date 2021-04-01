package exceptions.stack;

public class StackfullException extends Exception {
    public StackfullException() {
    }

    public StackfullException(String message) {
        super(message);
    }

    public StackfullException(String message, Throwable cause) {
        super(message, cause);
    }

    public StackfullException(Throwable cause) {
        super(cause);
    }

    public StackfullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
