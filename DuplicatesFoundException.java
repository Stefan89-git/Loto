package rs.itcentar;

public class DuplicatesFoundException extends Exception {
    private ImaBrojeve brojevi;

    public DuplicatesFoundException(ImaBrojeve brojevi, String message) {
        super(message);
        this.brojevi = brojevi;
    }

    public DuplicatesFoundException(ImaBrojeve brojevi, String message, Throwable cause) {
        super(message, cause);
        this.brojevi = brojevi;
    }

    public ImaBrojeve getBrojevi() {
        return brojevi;
    }
}
