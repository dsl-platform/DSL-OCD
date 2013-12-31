package com.dslplatform.ocd.aggregates.SetBinaryInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetBinaryAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetBinaryInAggregate.SetBinaryAggregate> {
    public SetBinaryAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetBinaryInAggregate.SetBinaryAggregate.class,
                locator);
    }
}
