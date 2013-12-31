package com.dslplatform.ocd.aggregates.ListOptStringInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptStringAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptStringInAggregate.ListOptStringAggregate> {
    public ListOptStringAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptStringInAggregate.ListOptStringAggregate.class,
                locator);
    }
}
