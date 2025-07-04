package ecommerce.domain.entities.carts;

import ecommerce.domain.entities.base.IEntity;
import ecommerce.domain.entities.cart_items.ICartItem;

import java.util.List;
import java.util.UUID;

public interface ICart extends IEntity {
    void setCustomerId(UUID customerId);

    UUID getCustomerId();

    void setCartItems(List<ICartItem> cartItems);

    List<ICartItem> getCartItems();

    void addCartItem(ICartItem cartItem);
}
