package com.dslplatform.ocd.aggregates.ArrayStringInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayStringAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayStringInAggregate.ArrayStringAggregate> {
    public ArrayStringAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayStringInAggregate.ArrayStringAggregate.class,
                locator);
    }
}
