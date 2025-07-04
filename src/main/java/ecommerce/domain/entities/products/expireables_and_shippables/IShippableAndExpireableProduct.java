package ecommerce.domain.entities.products.expireables_and_shippables;

import ecommerce.domain.entities.products.IProduct;

import java.time.LocalDateTime;

public interface IShippableAndExpireableProduct extends IProduct {
    LocalDateTime getExpiryDate();

    void setExpiryDate(LocalDateTime expiryDate);

    Double getWeight();

    void setWeight(Double weight);

    void setUnit(String unit);

    String getUnit();
}
