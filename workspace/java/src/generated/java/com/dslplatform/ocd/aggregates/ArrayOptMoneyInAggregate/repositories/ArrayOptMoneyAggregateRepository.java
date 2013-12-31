package com.dslplatform.ocd.aggregates.ArrayOptMoneyInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptMoneyAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptMoneyInAggregate.ArrayOptMoneyAggregate> {
    public ArrayOptMoneyAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptMoneyInAggregate.ArrayOptMoneyAggregate.class,
                locator);
    }
}
