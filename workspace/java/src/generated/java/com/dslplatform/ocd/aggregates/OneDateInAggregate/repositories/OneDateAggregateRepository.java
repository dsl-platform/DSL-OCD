package com.dslplatform.ocd.aggregates.OneDateInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneDateAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneDateInAggregate.OneDateAggregate> {
    public OneDateAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneDateInAggregate.OneDateAggregate.class,
                locator);
    }
}
