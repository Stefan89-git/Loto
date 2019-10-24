package rs.itcentar;

public class InvalidNumberRangeExcpetion extends Exception {
    private Tiket tiket;

    public InvalidNumberRangeExcpetion(Tiket tiket, String message) {
        super(message);
        this.tiket = tiket;
    }

    public InvalidNumberRangeExcpetion(Tiket tiket, String message, Throwable cause) {
        super(message, cause);
        this.tiket = tiket;
    }

    public Tiket getTiket() {
        return tiket;
    }
}
