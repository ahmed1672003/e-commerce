package ecommerce.domain.entities.products;

import ecommerce.domain.entities.base.Entity;


public abstract class Product extends Entity implements IProduct {
    private String name;
    private Double price;
    private Integer quantity;


    public Product(String name, Double price, Integer quantity) {
        super();
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(Double price) {
        this.price = price;
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
