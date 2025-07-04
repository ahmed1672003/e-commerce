package ecommerce.domain.entities.users;

import ecommerce.domain.entities.base.IEntity;

public interface IUser extends IEntity {
    void setUsername(String username);

    String getUsername();

    void setName(String name);

    String getName();

    void setEmail(String email);

    String getEmail();

    void setAddress(String address);

    String getAddress();
}
