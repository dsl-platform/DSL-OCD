package com.dslplatform.ocd.aggregates.ListBoolInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListBoolAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListBoolInAggregate.ListBoolAggregate> {
    public ListBoolAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListBoolInAggregate.ListBoolAggregate.class,
                locator);
    }
}
