package com.dslplatform.ocd.aggregates.ListOptBinaryInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptBinaryAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptBinaryInAggregate.ListOptBinaryAggregate> {
    public ListOptBinaryAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptBinaryInAggregate.ListOptBinaryAggregate.class,
                locator);
    }
}
