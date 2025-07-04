package ecommerce.domain.entities.users;

import ecommerce.domain.entities.base.Entity;

public abstract class User extends Entity implements IUser {

    private String name;
    private String username;
    private String email;
    private String address;

    public User(String name, String username, String email, String address) {
        super();
        this.name = name;
        this.username = username;
        this.email = email;
        this.address = address;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getAddress() {
        return address;
    }


}
