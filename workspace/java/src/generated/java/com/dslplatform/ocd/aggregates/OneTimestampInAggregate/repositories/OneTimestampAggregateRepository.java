package com.dslplatform.ocd.aggregates.OneTimestampInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneTimestampAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneTimestampInAggregate.OneTimestampAggregate> {
    public OneTimestampAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneTimestampInAggregate.OneTimestampAggregate.class,
                locator);
    }
}
