package com.dslplatform.ocd.aggregates.SetOptUUIDInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptUUIDAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptUUIDInAggregate.SetOptUUIDAggregate> {
    public SetOptUUIDAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptUUIDInAggregate.SetOptUUIDAggregate.class,
                locator);
    }
}
