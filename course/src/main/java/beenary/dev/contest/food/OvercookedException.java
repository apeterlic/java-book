package beenary.dev.contest.food;

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
