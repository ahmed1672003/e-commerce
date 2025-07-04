package ecommmerce.console;

import dummy.DummyData;
import ecommerce.domain.entities.carts.exceptions.CartException;
import ecommerce.domain.entities.orders.exceptions.OrderException;
import ecommerce.domain.entities.products.exceptions.ProductException;
import ecommerce.services.customers.CustomerService;
import ecommerce.services.customers.ICustomerService;

public class Main {
    public static void main(String[] args) throws OrderException, CartException, ProductException {
        DummyData.SeedCustomerCartItems();
        ICustomerService customerService = new CustomerService();
        customerService.checkout(DummyData.customer);
    }
}