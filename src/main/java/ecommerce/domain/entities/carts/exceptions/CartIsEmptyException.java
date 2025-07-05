package ecommerce.domain.entities.carts.exceptions;

import ecommerce.domain.entities.carts.ICart;

public class CartIsEmptyException extends CartException {
    public CartIsEmptyException(String message) {
        super(message);
    }

    public static void ThrowIfCartIsEmpty(ICart cart) {

        if (cart.getCartItems().isEmpty()) {
            throw new CartIsEmptyException("Can't checkout , please add products to your cart first.");
        }
    }
}
