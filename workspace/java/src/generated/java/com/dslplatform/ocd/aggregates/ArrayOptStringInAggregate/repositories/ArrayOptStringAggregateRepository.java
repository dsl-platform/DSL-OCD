package com.dslplatform.ocd.aggregates.ArrayOptStringInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptStringAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptStringInAggregate.ArrayOptStringAggregate> {
    public ArrayOptStringAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptStringInAggregate.ArrayOptStringAggregate.class,
                locator);
    }
}
