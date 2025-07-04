package ecommerce.domain.entities.base;

import java.util.UUID;

public abstract class Entity implements IEntity {
    protected UUID id;

    public Entity() {
        this.id = UUID.randomUUID();
    }

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return "Id: " + "[" + id + "]";
    }
}
