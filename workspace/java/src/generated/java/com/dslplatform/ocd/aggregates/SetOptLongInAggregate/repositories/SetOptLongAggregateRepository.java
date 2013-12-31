package com.dslplatform.ocd.aggregates.SetOptLongInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptLongAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptLongInAggregate.SetOptLongAggregate> {
    public SetOptLongAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptLongInAggregate.SetOptLongAggregate.class,
                locator);
    }
}
