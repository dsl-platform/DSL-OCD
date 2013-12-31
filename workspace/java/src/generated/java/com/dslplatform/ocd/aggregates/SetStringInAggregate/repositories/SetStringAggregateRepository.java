package com.dslplatform.ocd.aggregates.SetStringInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetStringAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetStringInAggregate.SetStringAggregate> {
    public SetStringAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetStringInAggregate.SetStringAggregate.class,
                locator);
    }
}
