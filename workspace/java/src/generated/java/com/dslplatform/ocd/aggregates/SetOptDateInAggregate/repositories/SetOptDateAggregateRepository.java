package com.dslplatform.ocd.aggregates.SetOptDateInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptDateAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptDateInAggregate.SetOptDateAggregate> {
    public SetOptDateAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptDateInAggregate.SetOptDateAggregate.class,
                locator);
    }
}
