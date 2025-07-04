package ecommerce.domain.entities.orders;

import ecommerce.domain.entities.base.IEntity;

import java.util.UUID;

public interface IOrder extends IEntity {
    void setCustomerId(UUID customerId);

    UUID getCustomerId();

    void setShippingPrice(Double shippingPrice);

    Double getShippingPrice();

    Double getTotalPrice();

    void setTotalPrice(Double totalPrice);

    void setShippingAddress(String shippingAddress);

    String getShippingAddress();
}

