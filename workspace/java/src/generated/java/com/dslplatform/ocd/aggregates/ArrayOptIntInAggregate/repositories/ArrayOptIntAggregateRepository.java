package com.dslplatform.ocd.aggregates.ArrayOptIntInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptIntAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptIntInAggregate.ArrayOptIntAggregate> {
    public ArrayOptIntAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptIntInAggregate.ArrayOptIntAggregate.class,
                locator);
    }
}
