package com.dslplatform.ocd.aggregates.ArrayOptUUIDInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptUUIDAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptUUIDInAggregate.ArrayOptUUIDAggregate> {
    public ArrayOptUUIDAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptUUIDInAggregate.ArrayOptUUIDAggregate.class,
                locator);
    }
}
