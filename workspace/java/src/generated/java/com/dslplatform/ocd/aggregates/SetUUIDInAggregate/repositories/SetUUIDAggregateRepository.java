package com.dslplatform.ocd.aggregates.SetUUIDInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetUUIDAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetUUIDInAggregate.SetUUIDAggregate> {
    public SetUUIDAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetUUIDInAggregate.SetUUIDAggregate.class,
                locator);
    }
}
