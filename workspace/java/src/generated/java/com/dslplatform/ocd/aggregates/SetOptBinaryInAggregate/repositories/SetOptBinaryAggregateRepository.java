package com.dslplatform.ocd.aggregates.SetOptBinaryInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptBinaryAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptBinaryInAggregate.SetOptBinaryAggregate> {
    public SetOptBinaryAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptBinaryInAggregate.SetOptBinaryAggregate.class,
                locator);
    }
}
