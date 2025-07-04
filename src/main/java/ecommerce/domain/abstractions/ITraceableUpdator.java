package ecommerce.domain.abstractions;

import java.util.UUID;

public interface ITraceableUpdator {
    void setCreatorId(UUID creatorId);

    UUID getCreatorId();
}
