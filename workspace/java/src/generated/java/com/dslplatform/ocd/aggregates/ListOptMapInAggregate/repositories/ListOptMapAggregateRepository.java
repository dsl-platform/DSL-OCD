package com.dslplatform.ocd.aggregates.ListOptMapInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptMapAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptMapInAggregate.ListOptMapAggregate> {
    public ListOptMapAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptMapInAggregate.ListOptMapAggregate.class,
                locator);
    }
}
