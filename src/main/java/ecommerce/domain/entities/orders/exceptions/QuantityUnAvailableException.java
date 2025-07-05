package ecommerce.domain.entities.orders.exceptions;

import ecommerce.domain.entities.cart_items.ICartItem;

public class QuantityUnAvailableException extends OrderException {
    public QuantityUnAvailableException(String message) {
        super(message);
    }

    public static void ThrowIfQuantityUnAvailable(ICartItem cartItem, Integer availabelQuantity) {
        if (cartItem.getQuantity() > availabelQuantity) {
            throw new QuantityUnAvailableException("Quantity is greater than " + availabelQuantity);
        }
    }
}
