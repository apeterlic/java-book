package dev.beenary.lesson10;

public class MissingSeasoningException extends RuntimeException {

    public MissingSeasoningException() {
    }

    public MissingSeasoningException(final String message) {
        super(message);
    }

    public MissingSeasoningException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
