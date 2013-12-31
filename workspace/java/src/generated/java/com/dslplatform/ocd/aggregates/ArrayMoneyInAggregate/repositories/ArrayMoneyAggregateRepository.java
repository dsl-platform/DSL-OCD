package com.dslplatform.ocd.aggregates.ArrayMoneyInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayMoneyAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayMoneyInAggregate.ArrayMoneyAggregate> {
    public ArrayMoneyAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayMoneyInAggregate.ArrayMoneyAggregate.class,
                locator);
    }
}
