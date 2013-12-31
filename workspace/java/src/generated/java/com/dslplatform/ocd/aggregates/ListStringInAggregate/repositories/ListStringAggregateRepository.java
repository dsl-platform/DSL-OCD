package com.dslplatform.ocd.aggregates.ListStringInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListStringAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListStringInAggregate.ListStringAggregate> {
    public ListStringAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListStringInAggregate.ListStringAggregate.class,
                locator);
    }
}
