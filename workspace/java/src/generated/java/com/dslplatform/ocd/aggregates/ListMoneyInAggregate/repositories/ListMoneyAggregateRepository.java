package com.dslplatform.ocd.aggregates.ListMoneyInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListMoneyAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListMoneyInAggregate.ListMoneyAggregate> {
    public ListMoneyAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListMoneyInAggregate.ListMoneyAggregate.class,
                locator);
    }
}
