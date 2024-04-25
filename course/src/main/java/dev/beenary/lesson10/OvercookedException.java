package dev.beenary.lesson10;

public class OvercookedException extends RuntimeException {

    public OvercookedException() {
    }

    public OvercookedException(final String message) {
        super(message);
    }

    public OvercookedException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
