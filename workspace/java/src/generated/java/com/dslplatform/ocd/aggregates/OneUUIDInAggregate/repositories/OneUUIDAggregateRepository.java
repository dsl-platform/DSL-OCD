package com.dslplatform.ocd.aggregates.OneUUIDInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneUUIDAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneUUIDInAggregate.OneUUIDAggregate> {
    public OneUUIDAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneUUIDInAggregate.OneUUIDAggregate.class,
                locator);
    }
}
