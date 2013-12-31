package com.dslplatform.ocd.aggregates.ArrayBoolInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayBoolAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayBoolInAggregate.ArrayBoolAggregate> {
    public ArrayBoolAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayBoolInAggregate.ArrayBoolAggregate.class,
                locator);
    }
}
