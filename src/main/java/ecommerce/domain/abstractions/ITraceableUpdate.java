package ecommerce.domain.abstractions;

import java.time.LocalDateTime;

public interface ITraceableUpdate {
    LocalDateTime getUpdatedOn();

    void setUpdatedOn(LocalDateTime updatedOn);
}
