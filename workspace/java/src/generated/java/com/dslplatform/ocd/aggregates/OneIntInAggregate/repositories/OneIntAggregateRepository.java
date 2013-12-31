package com.dslplatform.ocd.aggregates.OneIntInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class OneIntAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.OneIntInAggregate.OneIntAggregate> {
    public OneIntAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.OneIntInAggregate.OneIntAggregate.class,
                locator);
    }
}
