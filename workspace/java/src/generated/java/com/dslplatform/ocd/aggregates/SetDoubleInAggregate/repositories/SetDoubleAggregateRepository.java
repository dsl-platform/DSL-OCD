package com.dslplatform.ocd.aggregates.SetDoubleInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetDoubleAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetDoubleInAggregate.SetDoubleAggregate> {
    public SetDoubleAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetDoubleInAggregate.SetDoubleAggregate.class,
                locator);
    }
}
