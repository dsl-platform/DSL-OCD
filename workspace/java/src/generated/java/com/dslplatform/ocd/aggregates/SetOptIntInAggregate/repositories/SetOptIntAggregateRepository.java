package com.dslplatform.ocd.aggregates.SetOptIntInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptIntAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptIntInAggregate.SetOptIntAggregate> {
    public SetOptIntAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptIntInAggregate.SetOptIntAggregate.class,
                locator);
    }
}
