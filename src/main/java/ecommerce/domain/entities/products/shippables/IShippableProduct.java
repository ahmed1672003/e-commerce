package ecommerce.domain.entities.products.shippables;

import ecommerce.domain.entities.products.IProduct;

public interface IShippableProduct extends IProduct {
    Double getWeight();

    void setWeight(Double weight);

    void setUnit(String unit);

    String getUnit();
}
