package com.dslplatform.ocd.aggregates.OneLongInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneLongAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneLongInAggregate.OneLongAggregate> {
    public OneLongAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneLongInAggregate.OneLongAggregate.class,
                locator);
    }
}
