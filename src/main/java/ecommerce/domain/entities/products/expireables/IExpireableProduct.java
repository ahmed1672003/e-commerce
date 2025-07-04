package ecommerce.domain.entities.products.expireables;

import ecommerce.domain.entities.products.IProduct;

import java.time.LocalDateTime;

public interface IExpireableProduct extends IProduct {
    LocalDateTime getExpiryDate();

    void setExpiryDate(LocalDateTime expiryDate);

    default boolean isExpired() {
        var expiryDate = getExpiryDate();
        return expiryDate != null && LocalDateTime.now().isAfter(expiryDate);
    }
}
