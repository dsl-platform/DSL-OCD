package com.dslplatform.ocd.aggregates.ArrayBinaryInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayBinaryAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayBinaryInAggregate.ArrayBinaryAggregate> {
    public ArrayBinaryAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayBinaryInAggregate.ArrayBinaryAggregate.class,
                locator);
    }
}
