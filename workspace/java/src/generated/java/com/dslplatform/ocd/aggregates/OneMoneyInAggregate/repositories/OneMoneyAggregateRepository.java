package com.dslplatform.ocd.aggregates.OneMoneyInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneMoneyAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneMoneyInAggregate.OneMoneyAggregate> {
    public OneMoneyAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneMoneyInAggregate.OneMoneyAggregate.class,
                locator);
    }
}
