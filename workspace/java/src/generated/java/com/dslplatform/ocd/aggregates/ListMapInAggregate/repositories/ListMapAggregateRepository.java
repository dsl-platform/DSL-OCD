package com.dslplatform.ocd.aggregates.ListMapInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListMapAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListMapInAggregate.ListMapAggregate> {
    public ListMapAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListMapInAggregate.ListMapAggregate.class,
                locator);
    }
}
