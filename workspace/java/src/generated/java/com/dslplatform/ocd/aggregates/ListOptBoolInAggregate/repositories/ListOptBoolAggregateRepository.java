package com.dslplatform.ocd.aggregates.ListOptBoolInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptBoolAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptBoolInAggregate.ListOptBoolAggregate> {
    public ListOptBoolAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptBoolInAggregate.ListOptBoolAggregate.class,
                locator);
    }
}
