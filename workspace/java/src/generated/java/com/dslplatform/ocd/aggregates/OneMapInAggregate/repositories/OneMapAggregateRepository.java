package com.dslplatform.ocd.aggregates.OneMapInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneMapAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneMapInAggregate.OneMapAggregate> {
    public OneMapAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneMapInAggregate.OneMapAggregate.class,
                locator);
    }
}
