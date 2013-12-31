package com.dslplatform.ocd.aggregates.ArrayLongInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayLongAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayLongInAggregate.ArrayLongAggregate> {
    public ArrayLongAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayLongInAggregate.ArrayLongAggregate.class,
                locator);
    }
}
