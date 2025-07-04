package ecommerce.services.customers;

import dummy.DummyData;
import ecommerce.domain.entities.cart_items.ICartItem;
import ecommerce.domain.entities.carts.exceptions.CartException;
import ecommerce.domain.entities.carts.exceptions.CartIsEmptyException;
import ecommerce.domain.entities.customers.ICustomer;
import ecommerce.domain.entities.orders.IOrder;
import ecommerce.domain.entities.orders.Order;
import ecommerce.domain.entities.orders.exceptions.CustomerBalanceIsInsufficientException;
import ecommerce.domain.entities.orders.exceptions.OrderException;
import ecommerce.domain.entities.orders.exceptions.QuantityUnAvailableException;
import ecommerce.domain.entities.products.exceptions.ProductException;
import ecommerce.domain.entities.products.exceptions.ProductExpiredException;
import ecommerce.services.shipping.IShippingService;
import ecommerce.services.shipping.ShippingService;

import java.util.List;

public class CustomerService implements ICustomerService {
    private IShippingService shippingService = new ShippingService();

    @Override
    public void checkout(ICustomer customer) throws OrderException, CartException, ProductException {
        var cart = customer.getCart();
        CartIsEmptyException.ThrowIfCartIsEmpty(cart);
        var cartItems = cart.getCartItems();
        Double subTotalPrice = 0d;
        for (var cartItem : cartItems) {
            var product = DummyData.products.stream().filter(p -> p.getId() == cartItem.getProductId()).findFirst().orElse(null);
            if (product == null) {
                continue;
            }
            QuantityUnAvailableException.ThrowIfQuantityUnAvailable(cartItem, product.getQuantity());
            ProductExpiredException.ThrowIfProductExpired(product);
            subTotalPrice += product.getPrice() * cartItem.getQuantity();
            product.setQuantity(product.getQuantity() - cartItem.getQuantity());
        }

        IOrder order = new Order(customer.getId(), 500d, 0d, "Maadi, Cairo");
        order.setTotalPrice(subTotalPrice + order.getTotalPrice());
        addPayment(customer, order);
        shippingService.ShipOrderItems(cartItems);
        printReceipt(cartItems, order, customer);
    }

    private void addPayment(ICustomer customer, IOrder order) throws OrderException {
        CustomerBalanceIsInsufficientException.ThrowIfBalanceIsInsufficient(customer, order);
        customer.setBalance(customer.getBalance() - order.getTotalPrice());
    }

    private void printReceipt(List<ICartItem> cartItems, IOrder order, ICustomer customer) {
        System.out.println("** Checkout receipt **");
        for (var cartItem : cartItems) {
            var product = DummyData.products.stream().filter(p -> p.getId() == cartItem.getProductId()).findFirst().orElse(null);
            System.out.println(cartItem.getQuantity() + "x   " + product.getName() + "      " + product.getPrice());
        }
        System.out.println("---------------------------------------");
        System.out.println("Subtotal: " + (order.getTotalPrice() - order.getShippingPrice()));
        System.out.println("Shipping: " + order.getShippingPrice());
        System.out.println("Amount: " + order.getTotalPrice());
        System.out.println("Current balance: " + customer.getBalance());
    }
}