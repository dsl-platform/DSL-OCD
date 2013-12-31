package com.dslplatform.ocd.aggregates.OneStringInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneStringAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneStringInAggregate.OneStringAggregate> {
    public OneStringAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneStringInAggregate.OneStringAggregate.class,
                locator);
    }
}
