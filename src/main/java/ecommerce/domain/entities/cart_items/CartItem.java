package ecommerce.domain.entities.cart_items;

import ecommerce.domain.entities.base.Entity;

import java.util.UUID;

public final class CartItem extends Entity implements ICartItem {

    private UUID productId;
    private UUID cartId;
    private Integer quantity;

    public CartItem(UUID productId, UUID cartId, Integer quantity) {
        this.productId = productId;
        this.cartId = cartId;
        this.quantity = quantity;
    }

    @Override
    public UUID getProductId() {
        return productId;
    }

    @Override
    public void setProductId(UUID productId) {
        this.productId = productId;
    }

    @Override
    public UUID getCartId() {
        return cartId;
    }

    @Override
    public void setCartId(UUID cartId) {
        this.cartId = cartId;
    }

    @Override
    public Integer getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
