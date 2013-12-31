package com.dslplatform.ocd.aggregates.ListOptDoubleInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptDoubleAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptDoubleInAggregate.ListOptDoubleAggregate> {
    public ListOptDoubleAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptDoubleInAggregate.ListOptDoubleAggregate.class,
                locator);
    }
}
