package dummy;

import ecommerce.domain.entities.cart_items.CartItem;
import ecommerce.domain.entities.customers.Customer;
import ecommerce.domain.entities.customers.ICustomer;
import ecommerce.domain.entities.products.IProduct;
import ecommerce.domain.entities.products.expireables.ExpireableProduct;
import ecommerce.domain.entities.products.expireables_and_shippables.ShippableAndExpireableProduct;
import ecommerce.domain.entities.products.shippables.ShippableProduct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DummyData {

    public static List<IProduct> products = new ArrayList<>() {
        {
            add(new ShippableAndExpireableProduct("cheese", 20d, 400, "g", 250d, LocalDateTime.now().plusDays(30)));
            add(new ShippableAndExpireableProduct("luncheon", 40d, 30, "g", 5d, LocalDateTime.now().plusDays(25)));
            add(new ExpireableProduct("flour", 160d, 20, LocalDateTime.now().plusDays(60)));
            add(new ExpireableProduct("yogurt", 80d, 160, LocalDateTime.now().plusDays(15)));
            add(new ShippableProduct("scratchCard", 1500d, 30, 130d, "g"));
            add(new ShippableProduct("tv", 25000d, 7, 5.400, "g"));
        }
    };
    public static ICustomer customer = new Customer("ahmed adel basha", "ahmedadel", "ahmed.adel.elsayed.ali.basha@gmail.com", "maadi, cairo", 200000d);

    public static void SeedCustomerCartItems() {
        var cheese = products.get(0);
        var luncheon = products.get(1);
        var flour = products.get(2);
        var yogurt = products.get(3);
        var scratchCard = products.get(4);
        var tv = products.get(5);

        var cart = customer.getCart();
        cart.setCartItems(new ArrayList<>() {{
            add(new CartItem(cheese.getId(), cart.getId(), 3));
            add(new CartItem(luncheon.getId(), cart.getId(), 30));
            add(new CartItem(flour.getId(), cart.getId(), 1));
            add(new CartItem(yogurt.getId(), cart.getId(), 20));
            add(new CartItem(scratchCard.getId(), cart.getId(), 1));
            add(new CartItem(tv.getId(), cart.getId(), 100));
        }});
    }
}

// public Order(UUID customerId, Double shippingPrice, Double totalPrice, String shippingAddress)

