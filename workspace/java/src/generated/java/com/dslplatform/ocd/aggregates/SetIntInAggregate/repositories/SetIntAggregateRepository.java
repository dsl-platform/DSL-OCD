package com.dslplatform.ocd.aggregates.SetIntInAggregate.repositories;

import com.dslplatform.patterns.*;
import com.dslplatform.client.*;

public class SetIntAggregateRepository
        extends
        ClientPersistableRepository<com.dslplatform.ocd.aggregates.SetIntInAggregate.SetIntAggregate> {
    public SetIntAggregateRepository(
            final ServiceLocator locator) {
        super(
                com.dslplatform.ocd.aggregates.SetIntInAggregate.SetIntAggregate.class,
                locator);
    }
}
