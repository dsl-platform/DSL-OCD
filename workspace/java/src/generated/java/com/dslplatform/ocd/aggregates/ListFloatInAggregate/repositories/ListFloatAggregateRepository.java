package com.dslplatform.ocd.aggregates.ListFloatInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListFloatAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListFloatInAggregate.ListFloatAggregate> {
    public ListFloatAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListFloatInAggregate.ListFloatAggregate.class,
                locator);
    }
}
