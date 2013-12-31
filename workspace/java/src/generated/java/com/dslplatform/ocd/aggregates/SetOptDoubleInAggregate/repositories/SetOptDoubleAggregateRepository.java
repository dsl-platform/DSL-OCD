package com.dslplatform.ocd.aggregates.SetOptDoubleInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptDoubleAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptDoubleInAggregate.SetOptDoubleAggregate> {
    public SetOptDoubleAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptDoubleInAggregate.SetOptDoubleAggregate.class,
                locator);
    }
}
