package com.dslplatform.ocd.aggregates.ArrayOptBinaryInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptBinaryAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptBinaryInAggregate.ArrayOptBinaryAggregate> {
    public ArrayOptBinaryAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptBinaryInAggregate.ArrayOptBinaryAggregate.class,
                locator);
    }
}
