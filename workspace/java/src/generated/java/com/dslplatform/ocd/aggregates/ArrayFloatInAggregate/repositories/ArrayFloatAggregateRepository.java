package com.dslplatform.ocd.aggregates.ArrayFloatInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayFloatAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayFloatInAggregate.ArrayFloatAggregate> {
    public ArrayFloatAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayFloatInAggregate.ArrayFloatAggregate.class,
                locator);
    }
}
