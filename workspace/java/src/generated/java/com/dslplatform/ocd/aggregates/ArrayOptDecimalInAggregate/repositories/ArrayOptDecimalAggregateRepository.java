package com.dslplatform.ocd.aggregates.ArrayOptDecimalInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptDecimalAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptDecimalInAggregate.ArrayOptDecimalAggregate> {
    public ArrayOptDecimalAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptDecimalInAggregate.ArrayOptDecimalAggregate.class,
                locator);
    }
}
