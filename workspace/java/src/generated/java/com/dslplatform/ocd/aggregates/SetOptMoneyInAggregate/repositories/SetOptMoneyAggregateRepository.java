package com.dslplatform.ocd.aggregates.SetOptMoneyInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetOptMoneyAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetOptMoneyInAggregate.SetOptMoneyAggregate> {
    public SetOptMoneyAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetOptMoneyInAggregate.SetOptMoneyAggregate.class,
                locator);
    }
}
