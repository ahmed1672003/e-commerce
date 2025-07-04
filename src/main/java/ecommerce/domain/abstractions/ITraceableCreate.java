package ecommerce.domain.abstractions;

import java.time.LocalDateTime;

public interface ITraceableCreate {
    LocalDateTime getCratedOn();

    void setCreatedOn(LocalDateTime cratedOn);
}
