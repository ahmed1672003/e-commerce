package ecommerce.domain.entities.products.exceptions;

import ecommerce.domain.entities.products.IProduct;
import ecommerce.domain.entities.products.expireables.IExpireableProduct;

public class ProductExpiredException extends ProductException {
    public ProductExpiredException(String message) {
        super(message);
    }

    public static void ThrowIfProductExpired(IProduct product)  {
        if (product instanceof IExpireableProduct expireableProduct) {
            if (expireableProduct.isExpired()) {
                throw new ProductExpiredException("Product expired.");
            }
        }
    }
}
