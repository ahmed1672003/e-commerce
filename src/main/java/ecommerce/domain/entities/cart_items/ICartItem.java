package ecommerce.domain.entities.cart_items;

import java.util.UUID;

public interface ICartItem {
    UUID getProductId();

    void setProductId(UUID productId);

    UUID getCartId();

    void setCartId(UUID cartId);


    Integer getQuantity();

    void setQuantity(Integer quantity);
}
