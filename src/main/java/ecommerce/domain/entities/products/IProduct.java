package ecommerce.domain.entities.products;
import ecommerce.domain.entities.base.IEntity;

public interface IProduct extends IEntity {
    void setName (String name);
    String getName();
    void setPrice (Double price);
    Double getPrice();
    void setQuantity(Integer quantity);
    Integer getQuantity();
}