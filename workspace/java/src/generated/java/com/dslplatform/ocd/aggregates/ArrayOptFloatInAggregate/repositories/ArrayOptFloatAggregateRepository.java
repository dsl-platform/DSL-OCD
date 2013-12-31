package com.dslplatform.ocd.aggregates.ArrayOptFloatInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptFloatAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptFloatInAggregate.ArrayOptFloatAggregate> {
    public ArrayOptFloatAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptFloatInAggregate.ArrayOptFloatAggregate.class,
                locator);
    }
}
