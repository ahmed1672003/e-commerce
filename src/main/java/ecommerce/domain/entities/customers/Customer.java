package ecommerce.domain.entities.customers;

import ecommerce.domain.entities.carts.Cart;
import ecommerce.domain.entities.carts.ICart;
import ecommerce.domain.entities.orders.IOrder;
import ecommerce.domain.entities.orders.Order;
import ecommerce.domain.entities.users.User;

import java.util.ArrayList;
import java.util.List;

public final class Customer extends User implements ICustomer {
    private Double balance;
    private ICart cart;
    private List<IOrder> orders;

    public Customer(String name, String username, String email, String address, Double balance) {
        super(name, username, email, address);
        this.balance = balance;
        cart = new Cart(super.getId());
        orders = new ArrayList<>();
    }

    @Override
    public Double getBalance() {
        return this.balance;
    }

    @Override
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public ICart getCart() {
        return this.cart;
    }

    @Override
    public void addOrder(Order order) {
        orders.add((IOrder) order);
    }


}