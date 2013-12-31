package com.dslplatform.ocd.aggregates.ArrayDateInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayDateAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayDateInAggregate.ArrayDateAggregate> {
    public ArrayDateAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayDateInAggregate.ArrayDateAggregate.class,
                locator);
    }
}
