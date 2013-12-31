package com.dslplatform.ocd.aggregates.ArrayOptDateInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptDateAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptDateInAggregate.ArrayOptDateAggregate> {
    public ArrayOptDateAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptDateInAggregate.ArrayOptDateAggregate.class,
                locator);
    }
}
