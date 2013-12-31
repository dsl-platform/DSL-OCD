package com.dslplatform.ocd.aggregates.OneDoubleInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneDoubleAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneDoubleInAggregate.OneDoubleAggregate> {
    public OneDoubleAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneDoubleInAggregate.OneDoubleAggregate.class,
                locator);
    }
}
