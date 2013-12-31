package com.dslplatform.ocd.aggregates.SetMapInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetMapAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetMapInAggregate.SetMapAggregate> {
    public SetMapAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetMapInAggregate.SetMapAggregate.class,
                locator);
    }
}
