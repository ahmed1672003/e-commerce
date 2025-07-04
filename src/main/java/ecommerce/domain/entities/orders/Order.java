package ecommerce.domain.entities.orders;

import ecommerce.domain.entities.base.Entity;

import java.util.UUID;

public final class Order extends Entity implements IOrder {

    private UUID customerId;
    private Double shippingPrice;
    private Double totalPrice;
    private String shippingAddress;

    public Order(UUID customerId, Double shippingPrice, Double totalPrice, String shippingAddress) {
        this.customerId = customerId;
        this.shippingPrice = shippingPrice;
        this.totalPrice = totalPrice;
        this.shippingAddress = shippingAddress;
    }

    @Override
    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    @Override
    public UUID getCustomerId() {
        return customerId;
    }

    @Override
    public void setShippingPrice(Double shippingPrice) {
        this.shippingPrice = shippingPrice;
    }

    @Override
    public Double getShippingPrice() {
        return shippingPrice;
    }

    @Override
    public Double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    @Override
    public String getShippingAddress() {
        return shippingAddress;
    }
}
