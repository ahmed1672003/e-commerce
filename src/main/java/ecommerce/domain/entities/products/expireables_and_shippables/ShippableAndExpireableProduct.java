package ecommerce.domain.entities.products.expireables_and_shippables;

import ecommerce.domain.entities.products.Product;
import ecommerce.domain.entities.products.expireables.IExpireableProduct;
import ecommerce.domain.entities.products.shippables.IShippableProduct;

import java.time.LocalDateTime;

public final class ShippableAndExpireableProduct extends Product implements IShippableProduct, IExpireableProduct {

    private Double weight;
    private LocalDateTime expiryDate;
    private String unit;

    public ShippableAndExpireableProduct(String name, Double price, Integer quantity, String unit, Double weight, LocalDateTime expiryDate) {
        super(name, price, quantity);
        this.weight = weight;
        this.expiryDate = expiryDate;
        this.unit = unit;
    }

    @Override
    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    @Override
    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public Double getWeight() {
        return this.weight;
    }

    @Override
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String getUnit() {
        return unit;
    }
}
