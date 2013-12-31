package com.dslplatform.ocd.aggregates.ArrayOptBoolInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptBoolAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptBoolInAggregate.ArrayOptBoolAggregate> {
    public ArrayOptBoolAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptBoolInAggregate.ArrayOptBoolAggregate.class,
                locator);
    }
}
