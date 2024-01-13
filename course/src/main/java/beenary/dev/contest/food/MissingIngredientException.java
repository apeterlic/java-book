package beenary.dev.contest.food;

public class MissingIngredientException extends Exception {

    public MissingIngredientException() {
    }

    public MissingIngredientException(final String message) {
        super(message);
    }

    public MissingIngredientException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
