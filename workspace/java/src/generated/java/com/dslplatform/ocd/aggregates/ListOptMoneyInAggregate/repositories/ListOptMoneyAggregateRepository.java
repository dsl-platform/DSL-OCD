package com.dslplatform.ocd.aggregates.ListOptMoneyInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ListOptMoneyAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ListOptMoneyInAggregate.ListOptMoneyAggregate> {
    public ListOptMoneyAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ListOptMoneyInAggregate.ListOptMoneyAggregate.class,
                locator);
    }
}
