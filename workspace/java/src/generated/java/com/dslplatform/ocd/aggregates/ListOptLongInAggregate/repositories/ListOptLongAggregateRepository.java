package com.dslplatform.ocd.aggregates.ListOptLongInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptLongAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptLongInAggregate.ListOptLongAggregate> {
    public ListOptLongAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptLongInAggregate.ListOptLongAggregate.class,
                locator);
    }
}
