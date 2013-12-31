package com.dslplatform.ocd.aggregates.ListUUIDInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListUUIDAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListUUIDInAggregate.ListUUIDAggregate> {
    public ListUUIDAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListUUIDInAggregate.ListUUIDAggregate.class,
                locator);
    }
}
