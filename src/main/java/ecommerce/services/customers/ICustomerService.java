package ecommerce.services.customers;

import ecommerce.domain.entities.carts.exceptions.CartException;
import ecommerce.domain.entities.customers.ICustomer;
import ecommerce.domain.entities.orders.exceptions.OrderException;
import ecommerce.domain.entities.products.exceptions.ProductException;

public interface ICustomerService {
    void checkout(ICustomer customer) throws OrderException, CartException, ProductException;
}
