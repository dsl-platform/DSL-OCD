package com.dslplatform.ocd.aggregates.ArrayOptLongInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptLongAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptLongInAggregate.ArrayOptLongAggregate> {
    public ArrayOptLongAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptLongInAggregate.ArrayOptLongAggregate.class,
                locator);
    }
}
