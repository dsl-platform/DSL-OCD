package com.dslplatform.ocd.aggregates.ListLongInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListLongAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListLongInAggregate.ListLongAggregate> {
    public ListLongAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListLongInAggregate.ListLongAggregate.class,
                locator);
    }
}
