package com.dslplatform.ocd.aggregates.ListBinaryInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListBinaryAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListBinaryInAggregate.ListBinaryAggregate> {
    public ListBinaryAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListBinaryInAggregate.ListBinaryAggregate.class,
                locator);
    }
}
