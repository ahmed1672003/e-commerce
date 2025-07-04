package ecommerce.domain.abstractions;

import java.util.UUID;

public interface ITraceableCreator {
    void setCreatorId(UUID creatorId);

    UUID getCreatorId();
}
