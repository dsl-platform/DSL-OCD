package com.dslplatform.ocd.aggregates.ListOptIntInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptIntAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptIntInAggregate.ListOptIntAggregate> {
    public ListOptIntAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptIntInAggregate.ListOptIntAggregate.class,
                locator);
    }
}
