package com.dslplatform.ocd.aggregates.SetMoneyInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetMoneyAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetMoneyInAggregate.SetMoneyAggregate> {
    public SetMoneyAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetMoneyInAggregate.SetMoneyAggregate.class,
                locator);
    }
}
