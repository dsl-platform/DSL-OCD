package com.dslplatform.ocd.aggregates.ListIntInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListIntAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListIntInAggregate.ListIntAggregate> {
    public ListIntAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListIntInAggregate.ListIntAggregate.class,
                locator);
    }
}
