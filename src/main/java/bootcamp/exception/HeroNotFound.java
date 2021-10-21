package bootcamp.exception;

public class HeroNotFound extends RuntimeException{
    public HeroNotFound(String message) {
        super(message);
    }
}
