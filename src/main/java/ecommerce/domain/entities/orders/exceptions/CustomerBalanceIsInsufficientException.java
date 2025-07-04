package ecommerce.domain.entities.orders.exceptions;

import ecommerce.domain.entities.customers.ICustomer;
import ecommerce.domain.entities.orders.IOrder;

public class CustomerBalanceIsInsufficientException extends OrderException {
    public CustomerBalanceIsInsufficientException(String message) {
        super(message);
    }

    public static void ThrowIfBalanceIsInsufficient(ICustomer customer, IOrder order) throws OrderException {

        var customerBalance = customer.getBalance();
        var totalPrice = order.getTotalPrice();

        if (customerBalance == 0 || customerBalance < totalPrice) {
            throw new CustomerBalanceIsInsufficientException(customer.getBalance() + " is less than " + totalPrice + " | Please charge your balance first");
        }
    }
}
