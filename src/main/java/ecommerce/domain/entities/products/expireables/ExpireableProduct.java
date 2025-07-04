package ecommerce.domain.entities.products.expireables;

import ecommerce.domain.entities.products.Product;

import java.time.LocalDateTime;

public final class ExpireableProduct extends Product implements IExpireableProduct {
    private LocalDateTime expiryDate;

    public ExpireableProduct(String name, Double price, Integer quantity, LocalDateTime expiryDate) {
        super(name, price, quantity);
        this.expiryDate = expiryDate;
    }

    @Override
    public LocalDateTime getExpiryDate() {
        return expiryDate;
    }

    @Override
    public void setExpiryDate(LocalDateTime expiryDate) {
        this.expiryDate = expiryDate;
    }
}
