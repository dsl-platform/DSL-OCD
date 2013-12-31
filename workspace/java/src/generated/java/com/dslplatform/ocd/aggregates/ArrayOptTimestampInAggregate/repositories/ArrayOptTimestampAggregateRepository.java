package com.dslplatform.ocd.aggregates.ArrayOptTimestampInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptTimestampAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptTimestampInAggregate.ArrayOptTimestampAggregate> {
    public ArrayOptTimestampAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptTimestampInAggregate.ArrayOptTimestampAggregate.class,
                locator);
    }
}
