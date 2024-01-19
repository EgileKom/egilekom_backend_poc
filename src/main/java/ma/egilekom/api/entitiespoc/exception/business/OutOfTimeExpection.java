package ma.egilekom.api.entitiespoc.exception.business;

public class OutOfTimeExpection extends RuntimeException{

    public OutOfTimeExpection(String message) {
        super(message);
    }
}
