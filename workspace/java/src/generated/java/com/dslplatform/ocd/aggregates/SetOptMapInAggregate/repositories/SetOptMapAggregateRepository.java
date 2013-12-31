package com.dslplatform.ocd.aggregates.SetOptMapInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptMapAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptMapInAggregate.SetOptMapAggregate> {
    public SetOptMapAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptMapInAggregate.SetOptMapAggregate.class,
                locator);
    }
}
