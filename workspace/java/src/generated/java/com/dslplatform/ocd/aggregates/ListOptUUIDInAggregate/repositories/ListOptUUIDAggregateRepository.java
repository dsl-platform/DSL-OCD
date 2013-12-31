package com.dslplatform.ocd.aggregates.ListOptUUIDInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptUUIDAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptUUIDInAggregate.ListOptUUIDAggregate> {
    public ListOptUUIDAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptUUIDInAggregate.ListOptUUIDAggregate.class,
                locator);
    }
}
