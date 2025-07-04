package ecommerce.services.shipping;

import dummy.DummyData;
import ecommerce.domain.entities.cart_items.ICartItem;
import ecommerce.domain.entities.products.shippables.IShippableProduct;

import java.util.List;

public class ShippingService implements IShippingService {

    @Override
    public void ShipOrderItems(List<ICartItem> cartItems) {
        System.out.println("** Shipment notice **");
        for (ICartItem cartItem : cartItems) {
            var product = DummyData.products.stream().filter(p -> p.getId() == cartItem.getProductId()).findFirst().orElse(null);
            if (product instanceof IShippableProduct shippableProduct) {
                System.out.println(cartItem.getQuantity() + "x " + shippableProduct.getName() + "  " + shippableProduct.getWeight() + shippableProduct.getUnit());
            }
        }
        var sumOfWeight = cartItems.stream()
                .mapToDouble(ICartItem::getQuantity)
                .sum();
        System.out.println("Total package weight " + sumOfWeight / 1000 + "kg");
        System.out.println();
    }
}