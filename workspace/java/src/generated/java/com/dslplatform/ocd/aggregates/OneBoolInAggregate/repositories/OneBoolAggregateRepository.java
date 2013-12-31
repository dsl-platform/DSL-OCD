package com.dslplatform.ocd.aggregates.OneBoolInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneBoolAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneBoolInAggregate.OneBoolAggregate> {
    public OneBoolAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneBoolInAggregate.OneBoolAggregate.class,
                locator);
    }
}
