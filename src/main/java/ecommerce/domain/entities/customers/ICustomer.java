package ecommerce.domain.entities.customers;

import ecommerce.domain.entities.carts.ICart;
import ecommerce.domain.entities.orders.Order;
import ecommerce.domain.entities.users.IUser;

public interface ICustomer extends IUser {
    Double getBalance();

    void setBalance(Double balance);

    ICart getCart();

    void addOrder(Order order);
}
