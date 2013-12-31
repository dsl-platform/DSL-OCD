package com.dslplatform.ocd.aggregates.ListOptTimestampInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptTimestampAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptTimestampInAggregate.ListOptTimestampAggregate> {
    public ListOptTimestampAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptTimestampInAggregate.ListOptTimestampAggregate.class,
                locator);
    }
}
