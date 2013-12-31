package com.dslplatform.ocd.aggregates.ArrayDecimalInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayDecimalAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayDecimalInAggregate.ArrayDecimalAggregate> {
    public ArrayDecimalAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayDecimalInAggregate.ArrayDecimalAggregate.class,
                locator);
    }
}
