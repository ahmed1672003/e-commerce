package ecommerce.services.shipping;

import ecommerce.domain.entities.cart_items.ICartItem;

import java.util.List;

public interface IShippingService {
    void ShipOrderItems(List<ICartItem> cartItems);
}
