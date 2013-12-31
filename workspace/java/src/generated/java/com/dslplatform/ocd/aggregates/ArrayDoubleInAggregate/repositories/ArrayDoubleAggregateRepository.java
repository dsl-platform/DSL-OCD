package com.dslplatform.ocd.aggregates.ArrayDoubleInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayDoubleAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayDoubleInAggregate.ArrayDoubleAggregate> {
    public ArrayDoubleAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayDoubleInAggregate.ArrayDoubleAggregate.class,
                locator);
    }
}
