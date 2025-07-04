package ecommerce.domain.entities.base;

import java.util.UUID;

public interface IEntity {
    UUID getId();
    void setId(UUID id);
}
