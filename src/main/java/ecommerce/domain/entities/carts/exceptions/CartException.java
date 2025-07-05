package ecommerce.domain.entities.carts.exceptions;

public class CartException extends RuntimeException {
    public CartException(String message) {
        super(message);
    }
}
