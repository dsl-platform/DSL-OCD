package com.dslplatform.ocd.aggregates.SetOptBoolInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptBoolAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptBoolInAggregate.SetOptBoolAggregate> {
    public SetOptBoolAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptBoolInAggregate.SetOptBoolAggregate.class,
                locator);
    }
}
