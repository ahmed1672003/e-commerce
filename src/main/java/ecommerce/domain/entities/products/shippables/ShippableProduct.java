package ecommerce.domain.entities.products.shippables;

import ecommerce.domain.entities.products.Product;

public final class ShippableProduct extends Product implements IShippableProduct {

    private Double weight;
    private String unit;

    public ShippableProduct(String name, Double price, Integer quantity, Double weight, String unit) {
        super(name, price, quantity);
        this.weight = weight;
        this.unit = unit;
    }

    @Override
    public Double getWeight() {
        return weight;
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
