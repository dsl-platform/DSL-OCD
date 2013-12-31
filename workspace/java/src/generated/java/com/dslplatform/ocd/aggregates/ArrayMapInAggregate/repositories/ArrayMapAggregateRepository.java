package com.dslplatform.ocd.aggregates.ArrayMapInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class ArrayMapAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.ArrayMapInAggregate.ArrayMapAggregate> {
    public ArrayMapAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.ArrayMapInAggregate.ArrayMapAggregate.class,
                locator);
    }
}
