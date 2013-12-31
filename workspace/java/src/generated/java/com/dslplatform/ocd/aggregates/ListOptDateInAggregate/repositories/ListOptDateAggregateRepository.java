package com.dslplatform.ocd.aggregates.ListOptDateInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptDateAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptDateInAggregate.ListOptDateAggregate> {
    public ListOptDateAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptDateInAggregate.ListOptDateAggregate.class,
                locator);
    }
}
