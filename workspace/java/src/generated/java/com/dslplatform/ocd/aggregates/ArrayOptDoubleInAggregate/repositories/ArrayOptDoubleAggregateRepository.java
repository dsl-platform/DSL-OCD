package com.dslplatform.ocd.aggregates.ArrayOptDoubleInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptDoubleAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptDoubleInAggregate.ArrayOptDoubleAggregate> {
    public ArrayOptDoubleAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptDoubleInAggregate.ArrayOptDoubleAggregate.class,
                locator);
    }
}
