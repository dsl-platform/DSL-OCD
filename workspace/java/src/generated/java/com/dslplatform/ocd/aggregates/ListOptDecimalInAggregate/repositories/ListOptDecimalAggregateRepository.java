package com.dslplatform.ocd.aggregates.ListOptDecimalInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptDecimalAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptDecimalInAggregate.ListOptDecimalAggregate> {
    public ListOptDecimalAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptDecimalInAggregate.ListOptDecimalAggregate.class,
                locator);
    }
}
