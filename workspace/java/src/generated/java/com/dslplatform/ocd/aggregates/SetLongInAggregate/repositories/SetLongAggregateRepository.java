package com.dslplatform.ocd.aggregates.SetLongInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetLongAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetLongInAggregate.SetLongAggregate> {
    public SetLongAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetLongInAggregate.SetLongAggregate.class,
                locator);
    }
}
