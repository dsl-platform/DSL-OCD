package com.dslplatform.ocd.aggregates.ArrayUUIDInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayUUIDAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayUUIDInAggregate.ArrayUUIDAggregate> {
    public ArrayUUIDAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayUUIDInAggregate.ArrayUUIDAggregate.class,
                locator);
    }
}
