package com.dslplatform.ocd.aggregates.ArrayIntInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayIntAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayIntInAggregate.ArrayIntAggregate> {
    public ArrayIntAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayIntInAggregate.ArrayIntAggregate.class,
                locator);
    }
}
