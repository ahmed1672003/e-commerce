package ecommerce.domain.entities.carts;

import ecommerce.domain.entities.base.Entity;
import ecommerce.domain.entities.cart_items.ICartItem;

import java.util.List;
import java.util.UUID;

public final class Cart extends Entity implements ICart {
    private UUID customerId;
    private List<ICartItem> cartItems;

    public Cart(UUID customerId) {
        super();
        this.customerId = customerId;
    }

    @Override
    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    @Override
    public UUID getCustomerId() {
        return this.customerId;
    }

    @Override
    public void setCartItems(List<ICartItem> cartItems) {
        this.cartItems = cartItems;
    }

    @Override
    public List<ICartItem> getCartItems() {
        return cartItems;
    }

    @Override
    public void addCartItem(ICartItem cartItem) {
        this.cartItems.add(cartItem);
    }


}
