package com.dslplatform.ocd.aggregates.OneBinaryInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneBinaryAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneBinaryInAggregate.OneBinaryAggregate> {
    public OneBinaryAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneBinaryInAggregate.OneBinaryAggregate.class,
                locator);
    }
}
