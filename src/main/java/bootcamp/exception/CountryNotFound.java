package bootcamp.exception;

public class CountryNotFound extends RuntimeException{
    public CountryNotFound(String message) {
        super(message);
    }
}
