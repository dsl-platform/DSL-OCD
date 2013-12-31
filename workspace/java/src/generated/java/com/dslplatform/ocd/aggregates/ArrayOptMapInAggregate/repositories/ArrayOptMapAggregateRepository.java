package com.dslplatform.ocd.aggregates.ArrayOptMapInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayOptMapAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayOptMapInAggregate.ArrayOptMapAggregate> {
    public ArrayOptMapAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayOptMapInAggregate.ArrayOptMapAggregate.class,
                locator);
    }
}
